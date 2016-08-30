package property.org.mum.realEstate.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import property.org.mum.realEstate.DAO.CategoryDAO;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;

@Repository
public class CategoryDAOImpl implements CategoryDAO{

	@Override
	public List<Category> getAllCategories() {
		List<Category> categories=new ArrayList();
		return categories;
	}

}
