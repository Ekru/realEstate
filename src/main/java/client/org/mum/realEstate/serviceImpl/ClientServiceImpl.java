package client.org.mum.realEstate.serviceImpl;

import java.util.List;

import client.org.mum.realEstate.DAO.ClientDAO;
import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.service.ClientService;

public class ClientServiceImpl implements ClientService{
private ClientDAO clientDAO;
	
	public void addnewClient(Client client) {
		
		clientDAO.save(client).getCustomerNo();
	}

	
	public List<Client> getAllClient() {
		
		return clientDAO.findAll();
	}

	
	public Client getClient(long clientNo) {
		
		return clientDAO.getOne(clientNo);
	}


	public Client findClient(long clientNo) {
		
		return clientDAO.findOne(clientNo);
	}

}
