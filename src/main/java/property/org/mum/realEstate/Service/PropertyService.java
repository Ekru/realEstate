package property.org.mum.realEstate.Service;

import java.util.List;

import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;

public interface PropertyService {
	List<Property> getAllProperies();

	List<Property> getProperitiesByCategory(Category category);

	void addNewProperty(Property property);

	void deleteCategory(Category category);

	void addPropertyToSaved(Property property);
}
