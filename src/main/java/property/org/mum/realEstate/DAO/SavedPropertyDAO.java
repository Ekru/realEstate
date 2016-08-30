package property.org.mum.realEstate.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import property.org.mum.realEstate.domain.SavedProperty;
@Repository
public interface SavedPropertyDAO extends JpaRepository<SavedPropertyDAO, Integer> {
	public SavedPropertyDAO saveAndFlush(SavedProperty sProperty);
}
