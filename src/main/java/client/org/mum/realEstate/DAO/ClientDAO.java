package client.org.mum.realEstate.DAO;


import java.util.List;

import client.org.mum.realEstate.domain.Client;

public interface ClientDAO {

	void addnewClient(Client client);

	List<Client> getAllClient();

	Client getClient(int clientNo);

	Client findClient(int clientNo);

}
