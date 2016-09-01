package property.org.mum.realEstate.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import property.org.mum.realEstate.domain.Address;
import property.org.mum.realEstate.domain.Category;

public interface AddressDAO extends JpaRepository<Address, Integer>{

}