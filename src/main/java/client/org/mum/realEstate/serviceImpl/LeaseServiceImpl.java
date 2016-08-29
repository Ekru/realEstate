package client.org.mum.realEstate.serviceImpl;

import java.util.List;

import client.org.mum.realEstate.DAO.LeaseDAO;
import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;
import client.org.mum.realEstate.domain.LeaseStatus;
import client.org.mum.realEstate.service.LeaseService;

public class LeaseServiceImpl implements LeaseService {
private LeaseDAO leaseDAO;
//private Lease lease;

@Override
public Long save(Lease lease) {
	// TODO Auto-generated method stub
	lease.getLeaseStatus().equals(LeaseStatus.NEW);
	return leaseDAO.save(lease).getLeaseId();
	
}

@Override
public void delete(Lease lease) {
	// TODO Auto-generated method stub
	leaseDAO.delete(lease);
}

@Override
public Lease findById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Lease displayDetail(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Lease> findAll() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void updateStatus(Lease lease) {
	// TODO Auto-generated method stub
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
