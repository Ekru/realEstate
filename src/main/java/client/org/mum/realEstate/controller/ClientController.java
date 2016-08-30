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
import client.org.mum.realEstate.service.ClientService;
import client.org.mum.realEstate.service.LeaseService;
import owner.org.mum.realEstate.domain.Owner;
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
		
		//ownerService.addNewOwner(owner);
		//model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "register.jsp");
		return "template";
	}
	@RequestMapping(value="/client",method=RequestMethod.POST)
	public String submitclient(@ModelAttribute("client") Client client,BindingResult result,Model model) {
		
		if(result.hasErrors()){
			model.addAttribute("pageToRender", "register.jsp");
			return "template";
		}
		addressService.saveAddress(client.getAddress());
		clientService.addnewClient(client);
		
		
		//model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "client.jsp");
		return "template";
	}
	@RequestMapping(value="/leaseApplication",method=RequestMethod.GET)
	public String addNewOwner(Model model) {
		
		//ownerService.addNewOwner(owner);
		//model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "leaseApplication.jsp");
		return "template";
	}
	@RequestMapping(value="/leaseApplication",method=RequestMethod.POST)
	public String submitOwner(@ModelAttribute("lease") Lease lease,BindingResult result,Model model) {
		
		if(result.hasErrors()){
			model.addAttribute("pageToRender", "leaseApplication.jsp");
			return "template";
		}
		leaseService.save(lease);
		//model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "leaseApplicationSuccess.jsp");
		return "template";
	}
}
