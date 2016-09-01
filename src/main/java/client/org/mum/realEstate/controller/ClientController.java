package client.org.mum.realEstate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;
import client.org.mum.realEstate.domain.LeaseStatus;
import client.org.mum.realEstate.service.ClientService;
import client.org.mum.realEstate.service.LeaseService;
import property.org.mum.realEstate.Service.AddressService;
import property.org.mum.realEstate.Service.PropertyService;

@Controller
public class ClientController {
	@Autowired
	private PropertyService propertyService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private LeaseService leaseService;
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registerClient(Model model) {
		
		
		model.addAttribute("pageToRender", "register.jsp");
		return "template";
	}
	@RequestMapping(value="/clientProfileAction",method=RequestMethod.POST)
	public String submitclient(@ModelAttribute("client") Client client,BindingResult result,Model model) {
		
		if(result.hasErrors()){
			model.addAttribute("pageToRender", "register.jsp");
			return "template";
		}
		addressService.saveAddress(client.getAddress());
		clientService.addnewClient(client);
		
		
		
		//model.addAttribute("pageToRender", "clientProfile.jsp");
		return "redirect:/clientProfile";
	}
	@RequestMapping(value="/leaseForm/{propertyId}",method=RequestMethod.GET)
	public String addNewlease(Model model) {
		
		
		model.addAttribute("pageToRender", "leaseForm.jsp");
		return "template";
	}
	@RequestMapping(value="/leaseAction",method=RequestMethod.POST)
	public String submitLease(@ModelAttribute("lease") Lease lease,BindingResult result,Model model) {
		
		if(result.hasErrors()){
			
			model.addAttribute("pageToRender", "leaseForm.jsp");
			return "template";
		}
		lease.setLeaseStatus(LeaseStatus.NEW);
		addressService.saveAddress(lease.getClient().getAddress());
		clientService.addnewClient(lease.getClient());
		leaseService.save(lease);
		leaseService.updateStatus(lease);
		
//		model.addAttribute("pageToRender", "/leasetest.jsp");
//		return "template";
		return "redirect:/clientProfile";
	}
	
		
		
}
