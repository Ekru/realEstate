package property.org.mum.realEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import property.org.mum.realEstate.Service.CategoryService;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
import property.org.mum.realEstate.domain.Search;


@Controller
public class HomeController {
	@Autowired
	private PropertyService pService;
	@Autowired
	private CategoryService cService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome(Model model) {
		List<Category> categories = cService.getAllCategories();
		List<Property> featuredProperties = pService.getFeaturedProperties();
		model.addAttribute("featuredProperties", featuredProperties);
		model.addAttribute("categories", categories);
		model.addAttribute("search", new Search());
		model.addAttribute("pageToRender", "home.jsp");
		return "template";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String getSearch(Model model, @ModelAttribute("search") Search search) {
		List<Property> properties = pService.SearchProperties(search);
		List<Property> featuredProperties = pService.getFeaturedProperties();
		model.addAttribute("properties", properties);
		model.addAttribute("pageToRender", "search.jsp");
		model.addAttribute("featuredProperties", featuredProperties);
		return "template";
	}

	@RequestMapping("/category/{catId}")
	public String getCategory(@PathVariable int catId, Model model) {
		Category category = cService.getCategoryById(catId);
		List<Property> properties = pService.getProperitiesByCategory(category);
		List<Property> featuredProperties = pService.getFeaturedProperties();
		List<Category> categories = cService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("featuredProperties", featuredProperties);
		model.addAttribute("category", category);
		model.addAttribute("properties", properties);
		model.addAttribute("pageToRender", "category.jsp");
		return "template";
	}
}
