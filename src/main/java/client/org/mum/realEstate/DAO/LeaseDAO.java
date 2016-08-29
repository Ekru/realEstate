package client.org.mum.realEstate.DAO;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.domain.Lease;
import property.org.mum.realEstate.domain.Property;


@Repository
public interface LeaseDAO extends JpaRepository<Lease, Long>{
	//public void addLease(Lease lease); 

	//public List<Lease> getAllLease(); 

	public List<Lease> findByleaseId(Long leaseId);
	public List<Lease> findByincome(double income);

}
