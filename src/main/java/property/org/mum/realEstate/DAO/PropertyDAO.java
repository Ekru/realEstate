package property.org.mum.realEstate.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import owner.org.mum.realEstate.domain.Owner;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
import property.org.mum.realEstate.domain.Search;

public interface PropertyDAO extends JpaRepository<Property, Integer> {

	// public List<Property> findById(int id);

	public List<Property> findByCategory(Category category);

	public List<Property> findByOwner(Owner owner);

	// public Property findOne(int id);
	public List<Property> findByFeatured(boolean featured);

	public List<Property> findByName(String name);

	public List<Property> findByPrice(double price);

	public List<Property> findByCategoryInAndPriceIn(Category category, double price);

	public List<Property> findByCategoryInAndNameIn(Category category, String name);

	public List<Property> findByNameInAndPriceIn(String name, double price);

	public List<Property> findByCategoryInAndPriceInAndNameIn(Category category, double price, String name);
}
