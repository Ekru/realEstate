package property.org.mum.realEstate.webService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import property.org.mum.realEstate.Service.CategoryService;
import property.org.mum.realEstate.domain.Category;

@RestController
@RequestMapping("/WebService/Rest")
public class CategoryRestController {
	@Autowired
	private CategoryService cService;

	@RequestMapping(value = "/Category", method = RequestMethod.GET)
	public List<Category> getAllCategories() {
		return cService.getAllCategories();
	}

	@RequestMapping(value = "/Category", method = RequestMethod.POST)
	public void AddNewCategory(@RequestBody Category category) {
		cService.AddnewCategory(category);
	}

	@RequestMapping(value = "/Category/{categoryId}", method = RequestMethod.GET)
	public Category getOneCategory(@PathVariable("categoryId") String categoryId) {
		return cService.getCategoryById(Integer.parseInt(categoryId));
	}

	@RequestMapping(value = "/Category/{categoryId}", method = RequestMethod.PUT)
	public Category Update(@PathVariable int categoryId, @RequestBody Category category) {
		return cService.update(category);
	}

	@RequestMapping(value = "/Category/{categoryId}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int categoryId) {
		cService.delete(categoryId);
	}

}
