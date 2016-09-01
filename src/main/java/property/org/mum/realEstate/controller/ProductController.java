package property.org.mum.realEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import property.org.mum.realEstate.Service.CategoryService;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;

@Controller
public class ProductController {
	@Autowired
	private PropertyService pService;
	@Autowired
	private CategoryService cService;
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
}
