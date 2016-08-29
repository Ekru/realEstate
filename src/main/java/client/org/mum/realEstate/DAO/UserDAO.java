package client.org.mum.realEstate.DAO;

import org.hibernate.SessionFactory;

public interface UserDAO {
	
	 SessionFactory getSessionFactory();
	

	 void setSessionFactory(SessionFactory sessionFactory); 
}
