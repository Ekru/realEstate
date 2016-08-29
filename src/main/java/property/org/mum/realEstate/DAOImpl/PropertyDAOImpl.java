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
	private SessionFactory sessionFactory;

	// private static final Configuration configuration = new
	// Configuration().configure();
	public PropertyDAOImpl() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

	@Override
	public List<Property> getAllProperies() {
		List<Property> properties = new ArrayList<Property>();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Property");
		properties = query.getResultList();
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		return properties;
	}

	@Override
	public List<Property> getProperitiesByCategory(Category category) {
		List<Property> properties = new ArrayList<Property>();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Property where category=:category");
		query.setParameter("category", category);
		properties = query.getResultList();
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		return properties;
	}

	@Override
	public void addNewProperty(Property property) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(property);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void deleteCategory(Category category) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(category);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void addPropertyToSaved(SavedProperty aProperty) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(aProperty);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Property getPropertyById(int id) {
		Property property = new Property();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Property where id=:id");
		query.setParameter("id", id);
		property = (Property) query.getSingleResult();
		session.getTransaction().commit();
		session.close();
		return property;
	}

}
