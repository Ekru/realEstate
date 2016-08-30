package property.org.mum.realEstate.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import property.org.mum.realEstate.domain.SavedProperty;

public interface SavedPropertyDAO extends JpaRepository<SavedProperty, Integer> {
}
