/*package client.org.mum.realEstate.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import property.org.mum.realEstate.Service.CategoryService;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;

*//**
 * Handles requests for the application home page.
 *//*
@Controller
public class HomeController {
	@Autowired
//	private PropertyService pService;
	@Autowired
	private CategoryService cService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	*//**
	 * Simply selects the home view to render by returning its name.
	 *//*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<Category> categories=cService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("pageToRender", "home.jsp" );
		
		return "template";
	}
	
}
*/