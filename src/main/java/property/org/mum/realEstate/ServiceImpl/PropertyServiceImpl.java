package property.org.mum.realEstate.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client.org.mum.realEstate.domain.Client;
import property.org.mum.realEstate.DAO.CategoryDAO;
import property.org.mum.realEstate.DAO.PropertyDAO;
import property.org.mum.realEstate.DAO.SavedPropertyDAO;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
import property.org.mum.realEstate.domain.SavedProperty;
import property.org.mum.realEstate.domain.Search;

@Service
public class PropertyServiceImpl implements PropertyService {
	@Autowired
	private PropertyDAO propertyDAO;
	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
	private SavedPropertyDAO savedDAO;

	
	public List<Property> getAllProperies() {
		return propertyDAO.findAll();
	}

	
	public List<Property> getProperitiesByCategory(Category category) {
		return propertyDAO.findByCategory(category);
	}

	
	public void addNewProperty(Property property) {
		propertyDAO.save(property);

	}

	
	public void deleteCategory(Category category) {
		categoryDAO.delete(category);

	}

	
	public void addPropertyToSaved(SavedProperty sProperty) {
		// savedDAO.saveAndFlush(sProperty);

	}

	
	public Property getPropertyById(int id) {
		return propertyDAO.findOne(id);
	}

	
	public List<Property> SearchProperties(Category category, double minPrice, double maxPrice, String name) {
		List<Property> properties = propertyDAO.findAll();
		return properties;
	}

	
	public List<Property> getFeaturedProperties() {
		return propertyDAO.findByFeatured(true);
	}

	
	public List<Property> SearchProperties(Search search) {
		// return propertyDAO.searchProperty(search);
		return propertyDAO.findAll();
	}

	
	public List<SavedProperty> getSavedProperties(Client client) {

		return savedDAO.findByClient(client);
	}

}
