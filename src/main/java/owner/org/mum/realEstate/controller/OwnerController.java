package owner.org.mum.realEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;
import client.org.mum.realEstate.service.ClientService;
import owner.org.mum.realEstate.domain.Owner;
import owner.org.mum.realEstate.service.OwnerService;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
@Controller
public class OwnerController {

	@Autowired
	private PropertyService propertyService;
	//@Autowired
	//private ClientService clientService;
	@Autowired
	private OwnerService ownerService;
	
	@RequestMapping(value="/addOwner",method=RequestMethod.GET)
	public String addNewOwner(Model model) {
		
		//ownerService.addNewOwner(owner);
		//model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "addOwner.jsp");
		return "template";
	}
	@RequestMapping(value="/ownerProfile",method=RequestMethod.POST)
	public String submitOwner(@ModelAttribute("owner") Owner owner,BindingResult result,Model model) {
		
		if(result.hasErrors()){
			model.addAttribute("pageToRender", "addOwner.jsp");
			return "template";
		}
		ownerService.addNewOwner(owner);
		//model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "ownerProfile.jsp");
		return "template";
	}
	@RequestMapping(value="/owners/{id}/edit")
	public String editOwner(@PathVariable int id,Model model,
		final RedirectAttributes redirectAttributes) {
		
		ownerService.editOwnerById(id);
		redirectAttributes.addFlashAttribute("msg", "Owner added successfully!");
		redirectAttributes.addFlashAttribute("pageToRender", "owners.jsp");
		return "template";
	}
	@RequestMapping(value="/owners/{id}/delete")
	public String deleteOwner(@PathVariable int id,RedirectAttributes redirectAttributes){
		
		ownerService.deleteOwnerById(id);
		redirectAttributes.addFlashAttribute("msg", "owner is deleted");
		redirectAttributes.addFlashAttribute("pageToRender", "owners.jsp");
		return "template";
		
	}
	
	@RequestMapping(value="/owners/{id}")
	public String getOwnerById(@PathVariable int id,Model model){
		
		Owner owner=ownerService.getOwnerById(id);
		model.addAttribute("owner", owner);
		model.addAttribute("pageToRender", "owners.jsp");
		return "template";
		
	}
	@RequestMapping(value="/owners")
	public String getOwnerById(Model model){
		
		List<Owner> owners=ownerService.getOwners();
		model.addAttribute("owners", owners);
		model.addAttribute("pageToRender", "owners.jsp");
		return "template";
		
	}
	
	@RequestMapping(value="/addProperty",method=RequestMethod.GET)
	public String addNewProperty(Model model) {
		
		//ownerService.addNewOwner(owner);
		//model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "addProperty.jsp");
		return "template";
	}
	@RequestMapping(value="/addProperty",method=RequestMethod.POST)
	public String submitProperty(@ModelAttribute("property") Property property,BindingResult result,Model model) {
		
		if(result.hasErrors()){
			model.addAttribute("pageToRender", "addOwner.jsp");
			return "template";
		}
		propertyService.addNewProperty(property);
		//model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "addPropertySuccess.jsp");
		return "template";
	}
	@RequestMapping(value="/properties/{id}/edit")
	public String editProperty(@PathVariable int id,Model model) {
		
		//propertyService.editProperty(id);
		model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "properties.jsp");
		return "template";
	}
	@RequestMapping(value="/properties/{id}/delete")
	public String deleteProperty(@PathVariable int id,Model model){
		
		//propertyService.deleteProperty(id);
		model.addAttribute("msg", "Owner added successfully!");
		model.addAttribute("pageToRender", "properties.jsp");
		return "template";
		
	}
	
	@RequestMapping(value="/properties/{category}")
	public String getPropertiesByCategory(@PathVariable String category,Model model){
		Category cat=new Category();
		cat.setName(category);
		List<Property> properties=propertyService.getProperitiesByCategory(cat);
		model.addAttribute("properties", properties);
		model.addAttribute("pageToRender", "properties.jsp");
		return "template";
		
	}
	@RequestMapping(value="/properties")
	public String getAllproperties(Model model){
		
		List<Property> properties=propertyService.getAllProperies();
		model.addAttribute("properties", properties);
		model.addAttribute("pageToRender", "properties.jsp");
		return "template";
		
	}
	
	//search for a client
	@RequestMapping(value="/clients/{id}")
	public String getClient(@PathVariable int id,Model model){
		
		//Client client =clientService.getClient(id);
		//model.addAttribute("client", client);
		model.addAttribute("pageToRender", "clients.jsp");
		return "template";
		
	}
	//Didplay all clients
	@RequestMapping(value = "/clients")
	public String getAllClients(Model model) {

		//List<Client> clients = clientService.getAllClient();
		//model.addAttribute("clients", clients);
		model.addAttribute("pageToRender", "clients.jsp");
		return "template";

	}
	
	//Go through all leases to a property - applications and finalized leases
	@RequestMapping(value="/leases")
	public String getAllLeases(Model model){
		
		//List<Lease> leases =clientService.getAllLeases();
		//model.addAttribute("leases", leases);
		model.addAttribute("pageToRender", "leases.jsp");
		return "template";
		
	}
	
	//Show leases by status
	@RequestMapping(value="/leases/{status}")
	public String getLeasesByStatus(@PathVariable String status,Model model){
		
		//List<Lease> leases =clientService.getLeasesByStatus(status);
		//model.addAttribute("leases", leases);
		model.addAttribute("pageToRender", "leases.jsp");
		return "template";
		
	}
	
	//Show a lease of a given client
	@RequestMapping(value="/lease/{clientId}")
	public String getLeaseByClient(@PathVariable int id,Model model){
		
		//Lease lease =clientService.getLeaseByClient(id);
		//model.addAttribute("lease", lease);
		model.addAttribute("pageToRender", "leases.jsp");
		return "template";
		
	}
	
	//Show the leases for a given property
	@RequestMapping(value="/leases/{propertyId}")
	public String getLeasesByProperty(@PathVariable int id,Model model){
		
		//List<Lease> leases =clientService.getLeasesByProperty(id);
		//model.addAttribute("leases", leases);
		model.addAttribute("pageToRender", "leases.jsp");
		return "template";
		
	}
	
	@RequestMapping(value="/leases/{id}/approve")
	public String approveLease(@ModelAttribute("lease") Lease lease,BindingResult result,Model model){
		
		//clientService.editLease(lease);
		//model.addAttribute("lease", lease);
		model.addAttribute("pageToRender", "leases.jsp");
		return "template";
		
	}
	@RequestMapping(value="/leases/{id}/reject")
	public String rejectLease(@ModelAttribute("lease") Lease lease,BindingResult result,Model model){
		
		//clientService.deleteLease(lease);
		//model.addAttribute("lease", lease);
		model.addAttribute("pageToRender", "leases.jsp");
		return "template";
		
	}
	
}
