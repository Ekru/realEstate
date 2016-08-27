package property.org.mum.realEstate.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import property.org.mum.realEstate.DAO.PropertyDAO;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;

@Service
public class PropertyServiceImpl implements PropertyService {
	@Autowired
	private PropertyDAO propertyDAO;

	@Override
	public List<Property> getAllProperies() {
		return propertyDAO.getAllProperies();
	}

	@Override
	public List<Property> getProperitiesByCategory(Category category) {
		return propertyDAO.getProperitiesByCategory(category);
	}

	@Override
	public void addNewProperty(Property property) {
		propertyDAO.addNewProperty(property);

	}

	@Override
	public void deleteCategory(Category category) {
		propertyDAO.deleteCategory(category);

	}

	@Override
	public void addPropertyToSaved(Property property) {
		// TODO Auto-generated method stub

	}

}
