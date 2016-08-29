package owner.org.mum.realEstate.service;

import java.util.List;

import owner.org.mum.realEstate.domain.Owner;
//import property.org.mum.realEstate..Catagory;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;

public interface OwnerService {

	 void addNewOwner(Owner owner);
	 void deleteOwnerById(int ownerId);
	 void editOwnerById(int id);
     Owner getOwnerById(int id);
	 Owner getOwnerByName(String name);
	 List<Owner> getOwners();
	
     /*void addNewProperty(Property property);
     void deletePropertyByCategory(Category category);
	 void editProperty(int id);
	 Property getPropertyById(int id);
	 List<Property> getPropertyByCatagory(Category category);
	 List<Property> getProperties();
	
	//List<Lease> getApplications();
	 List<Property> getLeasedProperties();*/
	
	
}
