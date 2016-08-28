package property.org.mum.realEstate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping(value = "/property")
	public String getProduct(Model model) {
		model.addAttribute("pageToRender", "home.jsp");
		return "template";
	}
}
