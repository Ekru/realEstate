package client.org.mum.realEstate.serviceImpl;

import java.util.List;

import client.org.mum.realEstate.DAO.LeaseDAO;
import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;
import client.org.mum.realEstate.domain.LeaseStatus;
import client.org.mum.realEstate.service.LeaseService;

public class LeaseServiceImpl implements LeaseService {
private LeaseDAO leaseDAO;


@Override
public Long save(Lease lease) {
	
	lease.getLeaseStatus().equals(LeaseStatus.NEW);
	return leaseDAO.save(lease).getLeaseId();
	
}

@Override
public void delete(Lease lease) {
	
	leaseDAO.delete(lease);
}

@Override
public Lease findById(Long id) {
	
	return leaseDAO.findOne(id);
}

@Override
public Lease displayDetail(Long id) {
	
	return leaseDAO.getOne(id);
}

@Override
public List<Lease> findAll() {
	
	return leaseDAO.findAll();
}


@Override
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
}
