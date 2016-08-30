package property.org.mum.realEstate.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import property.org.mum.realEstate.DAO.CategoryDAO;
import property.org.mum.realEstate.DAO.PropertyDAO;
import property.org.mum.realEstate.DAO.SavedPropertyDAO;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
import property.org.mum.realEstate.domain.SavedProperty;

@Service
public class PropertyServiceImpl implements PropertyService {
	@Autowired
	private PropertyDAO propertyDAO;
	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
	private SavedPropertyDAO savedDAO;

	@Override
	public List<Property> getAllProperies() {
		return propertyDAO.findAll();
	}

	@Override
	public List<Property> getProperitiesByCategory(Category category) {
		return propertyDAO.findByCategory(category);
	}

	@Override
	public void addNewProperty(Property property) {
		propertyDAO.save(property);

	}

	@Override
	public void deleteCategory(Category category) {
		categoryDAO.delete(category);

	}

	@Override
	public void addPropertyToSaved(SavedProperty sProperty) {
		//savedDAO.saveAndFlush(sProperty);

	}

	@Override
	public Property getPropertyById(int id) {
		return propertyDAO.findOne(id);
	}

	@Override
	public List<Property> SearchProperties(Category category, double minPrice, double maxPrice, String name) {
		List<Property> properties = propertyDAO.findAll();
		return properties;
	}

	@Override
	public List<Property> getFeaturedProperties() {
		return propertyDAO.findByFeatured(true);
	}

}
