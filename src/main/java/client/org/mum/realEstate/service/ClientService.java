package client.org.mum.realEstate.service;

import java.util.List;

import client.org.mum.realEstate.domain.Client;

public interface ClientService {
	void addnewClient(Client client);

	List<Client> getAllClient();

	Client getClient(long clientNo);

	Client findClient(long clientNo);

}