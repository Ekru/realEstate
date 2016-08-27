package owner.org.mum.realEstate.DAO;

import java.util.List;

import owner.org.mum.realEstate.domain.Owner;

public interface OwnerDAO {

	 void addNewOwner(Owner owner);
	 void deleteOwnerById(int ownerId);
	 void editOwnerById(int id);
     Owner getOwnerById(int id);
	 Owner getOwnerByName(String name);
	 List<Owner> getOwners();
}
