package property.org.mum.realEstate.Service;

import java.util.List;

import client.org.mum.realEstate.domain.Client;
import owner.org.mum.realEstate.domain.Owner;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
import property.org.mum.realEstate.domain.SavedProperty;
import property.org.mum.realEstate.domain.Search;


public interface PropertyService {
	List<Property> getAllProperies();

	List<Property> getProperitiesByCategory(Category category);

	Property getPropertyById(int id);

	void addNewProperty(Property property);

	void deleteCategory(Category category);

	void addPropertyToSaved(SavedProperty sProperty);

	List<Property> SearchProperties(Category category, double minPrice, double maxPrice, String name);

	List<Property> getFeaturedProperties();

	List<Property> SearchProperties(Search search);
	List<SavedProperty> getSavedProperties(Client client);

	List<Property> getPropertiesByOwner(Owner owner);
}
