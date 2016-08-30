package property.org.mum.realEstate.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import property.org.mum.realEstate.domain.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {
}
