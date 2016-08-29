package client.org.mum.realEstate.DAOImpl;

import org.hibernate.SessionFactory;

import client.org.mum.realEstate.DAO.UserDAO;

public class UserDAOImpl implements UserDAO {

	SessionFactory sessionFactory;
	
	public UserDAOImpl(){}
	
	public UserDAOImpl(SessionFactory sessionFactory){
		
		this.sessionFactory=sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
