package property.org.mum.realEstate.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
@Repository
public interface PropertyDAO extends JpaRepository<Property, Integer> {

//	public List<Property> findById(int id);

	public List<Property> findByCategory(Category category);

//	public List<Property> findAll();

//	public Property findOne(int id);
    public List<Property> findByFeatured(boolean featured);
}
