package client.org.mum.realEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;
import client.org.mum.realEstate.service.ClientService;
import client.org.mum.realEstate.service.LeaseService;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Property;
import property.org.mum.realEstate.domain.SavedProperty;

@Controller
public class ClientProfileController {
	@Autowired
	private ClientService clientService;
	@Autowired
	private LeaseService leaseService;
	@Autowired
	private PropertyService pService;

	@RequestMapping("/clientProfile")
	public String getClientProfile(Model model) {
		long clientId = 1;
		Client client = clientService.findClient(clientId);
		List<Lease> leases = leaseService.findByClient(client);
		List<SavedProperty> savedProperties = pService.getSavedProperties(client);
		model.addAttribute("savedProperties", savedProperties);
		model.addAttribute("leases", leases);
		model.addAttribute("client", client);
		model.addAttribute("pageToRender", "clientProfile.jsp");
		return "template";
	}
	@RequestMapping("/Client/lease/{leaseId}")
	public String getLease(@PathVariable long leaseId,Model model){
		Lease lease=leaseService.findById(leaseId);
		List<Property> featuredProperties = pService.getFeaturedProperties();
		model.addAttribute("featuredProperties", featuredProperties);
		model.addAttribute("lease",lease);
		
		model.addAttribute("pageToRender","lease.jsp");
		return "template";
	}
	
}
