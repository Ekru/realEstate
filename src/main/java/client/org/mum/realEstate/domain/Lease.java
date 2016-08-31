package client.org.mum.realEstate.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import property.org.mum.realEstate.domain.Address;
import property.org.mum.realEstate.domain.Property;

@Entity
public class Lease {
	@Id
	@GeneratedValue
	private long leaseId;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "clientNo")
	private Client client;
	
	
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id")
	private Property property;

	
	private int income;
	private Date leaseDate;
	private LeaseStatus leaseStatus;

	public Lease() {
	}
	
	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	

	public long getLeaseId() {
		return leaseId;
	}

	



	public LeaseStatus getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(LeaseStatus leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public void setLeaseId(int leaseId) {
		this.leaseId = leaseId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Property getProperty() {
		return property;
	}

	public void setPropertyNo(Property property) {
		this.property = property;
	}

	

	public Date getLeaseDate() {
		return leaseDate;
	}

	public void setLeaseDate(Date leaseDate) {
		this.leaseDate = leaseDate;
	}

}
