package property.org.mum.realEstate.Service;

import java.util.List;

import property.org.mum.realEstate.domain.Category;

public interface CategoryService {
	List<Category> getAllCategories();

	Category getCategoryById(int id);

	void AddnewCategory(Category category);

	Category update(Category category);

	void delete(int id);
}
