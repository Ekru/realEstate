package property.org.mum.realEstate.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import property.org.mum.realEstate.DAO.CategoryDAO;
import property.org.mum.realEstate.Service.CategoryService;
import property.org.mum.realEstate.domain.Category;


@Service
public class CategoryserviceImpl implements CategoryService {
	@Autowired
	private CategoryDAO categoryDAO;

	
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryDAO.findAll();
	}

	
	public Category getCategoryById(int id) {
		return categoryDAO.findOne(id);
	}

}
