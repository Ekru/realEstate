package property.org.mum.realEstate.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import property.org.mum.realEstate.domain.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {
	public List<Category> findAll();
}
