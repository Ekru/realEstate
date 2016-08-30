package client.org.mum.realEstate.serviceImpl;

import java.util.List;

import client.org.mum.realEstate.DAO.ClientDAO;
import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.service.ClientService;

public class ClientServiceImpl implements ClientService{
private ClientDAO clientDAO;
	@Override
	public void addnewClient(Client client) {
		
		clientDAO.save(client).getCustomerNo();
	}

	@Override
	public List<Client> getAllClient() {
		
		return clientDAO.findAll();
	}

	@Override
	public Client getClient(long clientNo) {
		
		return clientDAO.getOne(clientNo);
	}

	@Override
	public Client findClient(long clientNo) {
		
		return clientDAO.findOne(clientNo);
	}

}
