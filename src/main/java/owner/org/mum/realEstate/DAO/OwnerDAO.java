package owner.org.mum.realEstate.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import owner.org.mum.realEstate.domain.Owner;
@Repository
public interface OwnerDAO extends JpaRepository<Owner,Integer>{

	 /*void addNewOwner(Owner owner);
	 void deleteOwnerById(int ownerId);
	 void editOwnerById(int id);
     Owner getOwnerById(int id);     
	 Owner findByFirstName(String name);
	 List<Owner> findAll();*/
}
