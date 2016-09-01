package client.org.mum.realEstate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client.org.mum.realEstate.DAO.LeaseDAO;
import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;
import client.org.mum.realEstate.domain.LeaseStatus;
import client.org.mum.realEstate.service.LeaseService;
@Service
public class LeaseServiceImpl implements LeaseService {
	@Autowired
private LeaseDAO leaseDAO;



public void save(Lease lease) {
	
	if(lease.getLeaseStatus().equals(LeaseStatus.NEW)){
		leaseDAO.save(lease);
	};
	 
	
}


public void delete(Lease lease) {
	
	leaseDAO.delete(lease);
}


public Lease findById(Long id) {
	
	return leaseDAO.findOne(id);
}


public Lease displayDetail(Long id) {
	
	return leaseDAO.getOne(id);
}


public List<Lease> findAll() {
	
	return leaseDAO.findAll();
}



public void updateStatus(Lease lease) {
	
	if(lease.getIncome() > 27000){
		lease.setLeaseStatus(LeaseStatus.ACCEPTED);
	}
	if(lease.getIncome() < 20000){
		lease.setLeaseStatus(LeaseStatus.DENIED);
	}
	else {
		lease.setLeaseStatus(LeaseStatus.PENDING);
	}
	
}


@Override
public List<Lease> findByClient(Client client) {
	// TODO Auto-generated method stub
	return leaseDAO.findByClient(client);
}



}
