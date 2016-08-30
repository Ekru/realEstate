package property.org.mum.realEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import property.org.mum.realEstate.Service.CategoryService;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;

@Controller
public class HomeController {
	@Autowired
	private PropertyService pService;
	@Autowired
	private CategoryService cService;

	@RequestMapping("/")
	public String getHome(Model model) {
		List<Category> categories = cService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("pageToRender", "home.jsp");
		return "template";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String getSearch(Model model, @PathVariable("category") Category category,
			@PathVariable("minPrice") double minPrice, @PathVariable("maxPrice") double maxPrice,
			@PathVariable("name") String name) {
		List<Property> properties = pService.SearchProperties(category, minPrice, maxPrice, name);
		List<Property> featuredProperties = pService.getFeaturedProperties();
		model.addAttribute("properties", properties);
		model.addAttribute("pageToRender", "search.jsp");
		model.addAttribute("featuredProperties", featuredProperties);
		return "template";
	}
	@RequestMapping("/category/{catId}")
	public String getCategory(@PathVariable int catId,Model model){
		Category category=cService.getCategoryById(catId);
		List<Property> properties=pService.getProperitiesByCategory(category);
		model.addAttribute("category", category);
		model.addAttribute("properties", properties);
		model.addAttribute("pageToRender", "category.jsp");
		return "template";
	}
}
