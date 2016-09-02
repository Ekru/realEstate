package property.org.mum.realEstate.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.service.ClientService;
import property.org.mum.realEstate.Service.CategoryService;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
import property.org.mum.realEstate.domain.SavedProperty;

@Controller
public class ProductController {
	@Autowired
	private PropertyService pService;
	@Autowired
	private CategoryService cService;
	@Autowired
	private ClientService clientService;
	@RequestMapping(value = "/property/{id}")
	public String getProduct(@PathVariable int id,Model model) {
		Property property=pService.getPropertyById(id);
		List<Property> featuredProperties = pService.getFeaturedProperties();
		List<Category> categories = cService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("featuredProperties", featuredProperties);
		model.addAttribute("property",property);
		model.addAttribute("pageToRender", "property.jsp");
		return "template";
	}
	@RequestMapping(value = "/property/save/{id}")
	public String AddToProperty(@PathVariable int id,Model model) {
		int clientId=1;
		Client client=clientService.findClient(clientId);
		Property property=pService.getPropertyById(id);
		SavedProperty savedProperty=new SavedProperty(new Date(), property, client);
		pService.addPropertyToSaved(savedProperty);
		return "redirect:/clientProfile";
	}
}
