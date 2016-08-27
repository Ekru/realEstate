package owner.org.mum.realEstate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import owner.org.mum.realEstate.DAO.OwnerDAO;
import owner.org.mum.realEstate.domain.Owner;
import owner.org.mum.realEstate.service.OwnerService;
import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	private OwnerDAO ownerDAO;
	@Autowired
	private PropertyService propertyService;
	@Override
	public void addNewOwner(Owner owner) {
		// TODO Auto-generated method stub
		ownerDAO.addNewOwner(owner);
		
	}

	@Override
	public void deleteOwnerById(int ownerId) {
		// TODO Auto-generated method stub
		ownerDAO.deleteOwnerById(ownerId);
	}

	@Override
	public void editOwnerById(int id) {
		// TODO Auto-generated method stub
		ownerDAO.editOwnerById(id);
	}

	@Override
	public Owner getOwnerById(int id) {
		// TODO Auto-generated method stub
		return ownerDAO.getOwnerById(id);
	}

	@Override
	public Owner getOwnerByName(String name) {
		// TODO Auto-generated method stub
		return ownerDAO.getOwnerByName(name);
	}

	@Override
	public List<Owner> getOwners() {
		// TODO Auto-generated method stub
		return ownerDAO.getOwners();
	}

	@Override
	public void addNewProperty(Property property) {
		// TODO Auto-generated method stub
		propertyService.addNewProperty(property);
	}

	@Override
	public void deletePropertyByCategory(Category category) {
		// TODO Auto-generated method stub
		propertyService.deleteCategory(category);
	}

	@Override
	public void editProperty(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Property getPropertyById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> getPropertyByCatagory(Category category) {
		// TODO Auto-generated method stub
		return propertyService.getProperitiesByCategory(category);
	}

	@Override
	public List<Property> getProperties() {
		// TODO Auto-generated method stub
		return propertyService.getAllProperies() ;
	}

	@Override
	public List<Property> getLeasedProperties() {
		// TODO Auto-generated method stub
		return null;
	}

}
