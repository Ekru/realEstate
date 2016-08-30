package client.org.mum.realEstate.DAO;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;

public interface ClientDAO extends JpaRepository<Client, Long>{

	//void addnewClient(Client client);

//	List<Client> getAllClient();
//
//	Client getClient(int clientNo);
//
//	Client findClient(int clientNo);

}
