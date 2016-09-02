package property.org.mum.realEstate.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import property.org.mum.realEstate.domain.Address;

@Transactional
public interface AddressDAO extends JpaRepository<Address, Integer>{

}