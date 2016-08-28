package client.org.mum.realEstate.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import client.org.mum.realEstate.DAO.ClientDAO;
import client.org.mum.realEstate.domain.Client;

@Repository
@Transactional
public class ClientDAOImpl implements ClientDAO {
	
	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public void addnewClient(Client client) {
		
		entityManager.persist(client);
	}

	@Override
	public List<Client> getAllClient() {
		
		List<Client> resultList = entityManager.createQuery("select * from Client", Client.class).getResultList();
		return resultList;
		
	}

	@Override
	public Client getClient(int clientNo) {
		
		return entityManager.find(Client.class, clientNo);
		
	}

	@Override
	public Client findClient(int clientNo) {
		// TODO Auto-generated method stub
		return null;
	}

}