package property.org.mum.realEstate.DAOImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import property.org.mum.realEstate.DAO.PropertyDAO;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;

@Repository
public class PropertyDAOImpl implements PropertyDAO{

	@Override
	public List<Property> getAllProperies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> getProperitiesByCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewProperty(Property property) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPropertyToSaved(Property property) {
		// TODO Auto-generated method stub
		
	}

}
