package property.org.mum.realEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import property.org.mum.realEstate.Service.CategoryService;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;

@Controller
public class HomeController {
	@Autowired
	private PropertyService pService;
	@Autowired
	private CategoryService cService;

	@RequestMapping("/")
	public String getHome(Model model) {
		//List<Category> categories = cService.getAllCategories();
		//model.addAttribute("categories", categories);
		model.addAttribute("pageToRender", "home.jsp");
		return "template";
	}
}
