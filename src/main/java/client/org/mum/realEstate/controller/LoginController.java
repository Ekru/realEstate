package client.org.mum.realEstate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import property.org.mum.realEstate.Service.PropertyService;

@Controller
public class LoginController {
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("pageToRender", "login.jsp");
		return "template";
		
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
		model.addAttribute("error", "true");
		//model.addAttribute("error", "Invalid username and password!");
		model.addAttribute("pageToRender", "login.jsp");
		return "template";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		//model.addAttribute("msg", "You've been logged out successfully.");
		model.addAttribute("pageToRender", "login.jsp");
		return "template";
	}
}