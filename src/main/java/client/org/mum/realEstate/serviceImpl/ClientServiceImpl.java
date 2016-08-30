package client.org.mum.realEstate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client.org.mum.realEstate.DAO.ClientDAO;
import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.service.ClientService;
@Service
public class ClientServiceImpl implements ClientService{
	@Autowired
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
