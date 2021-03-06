package client.org.mum.realEstate.service;

import java.util.List;

import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;

public interface LeaseService {
	
	void save(Lease lease);

	public void delete(Lease lease);

	List<Lease> findAll();
	List<Lease> findByClient(Client client);

	Lease findById(Long id);

	Lease displayDetail(Long id);
	public void  updateStatus(Lease lease);
}
