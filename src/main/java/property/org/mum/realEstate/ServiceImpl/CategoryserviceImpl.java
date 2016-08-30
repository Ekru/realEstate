package property.org.mum.realEstate.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import property.org.mum.realEstate.DAO.CategoryDAO;
import property.org.mum.realEstate.Service.CategoryService;
import property.org.mum.realEstate.domain.Category;


@Service
public class CategoryserviceImpl implements CategoryService {
	private CategoryDAO categoryDAO;

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryDAO.findAll();
	}

	@Override
	public Category getCategoryById(int id) {
		return categoryDAO.findOne(id);
	}

}
