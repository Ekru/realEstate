package property.org.mum.realEstate.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import client.org.mum.realEstate.domain.Client;
import property.org.mum.realEstate.domain.SavedProperty;

public interface SavedPropertyDAO extends JpaRepository<SavedProperty, Integer> {
	List<SavedProperty> findByClient(Client client);
}
