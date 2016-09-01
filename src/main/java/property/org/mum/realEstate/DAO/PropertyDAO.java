package property.org.mum.realEstate.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import owner.org.mum.realEstate.domain.Owner;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;

public interface PropertyDAO extends JpaRepository<Property, Integer> {

	public List<Property> findByCategory(Category category);

	public List<Property> findByOwner(Owner owner);

	public List<Property> findByFeatured(boolean featured);

	public List<Property> findByName(String name);

	public List<Property> findByPrice(double price);

	public List<Property> findByCategoryInAndPriceIn(Category category, double price);

	public List<Property> findByCategoryInAndNameIn(Category category, String name);

	public List<Property> findByNameInAndPriceIn(String name, double price);

	public List<Property> findByCategoryInAndPriceInAndNameIn(Category category, double price, String name);
}
