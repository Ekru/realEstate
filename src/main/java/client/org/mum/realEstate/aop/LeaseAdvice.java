package client.org.mum.realEstate.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;
import client.org.mum.realEstate.messaging.ApplicationMailer;
import client.org.mum.realEstate.service.ClientService;
import client.org.mum.realEstate.service.LeaseService;

@Aspect
public class LeaseAdvice {
	@Autowired
	ClientService clientService;
	
	ApplicationMailer mailer;
	
	@Autowired
	LeaseService leaseService;
	
	
	public ApplicationMailer getMailer() {
		return mailer;
	}
	public void setMailer(ApplicationMailer mailer) {
		this.mailer = mailer;
	}
	

	@After("execution(* client.org.mum.realEstate.controller.ClientController.submitLease(..))")
	//+"args(lease, result, model)")
	public void notificationAdvice(JoinPoint joinpoint){
		Object[] args = joinpoint.getArgs();
        Lease lease = (Lease) args[0];
        
		
		Client client = clientService.findClient(lease.getClient().getClientNo());
		System.out.println("Sending Email to========"+client.getFirstName()+"About his/her application Status========his/her application status is========="+lease.getLeaseStatus());
		if(client.getEmail()!=null){ 
			mailer.sendMail(client.getEmail(), "Lease Application Confirmation", "This is a message to notify that you have applied lease for a property in our RealEstate booked on +lease.getleaseDate()");
		}
	
	}

}
