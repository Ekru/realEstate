package property.org.mum.realEstate.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import property.org.mum.realEstate.DAO.PropertyDAO;
import property.org.mum.realEstate.domain.Category;
import property.org.mum.realEstate.domain.Property;
import property.org.mum.realEstate.domain.SavedProperty;

@Repository
public class PropertyDAOImpl implements PropertyDAO {


	@Override
	public List<Property> getAllProperies() {
		
		return null;
	}

	@Override
	public List<Property> getProperitiesByCategory(Category category) {
		
		return null;
	}

	@Override
	public void addNewProperty(Property property) {
		

	}

	@Override
	public void deleteCategory(Category category) {
		

	}

	@Override
	public void addPropertyToSaved(SavedProperty aProperty) {
		
	}

	@Override
	public Property getPropertyById(int id) {
		return null;
	}

}
