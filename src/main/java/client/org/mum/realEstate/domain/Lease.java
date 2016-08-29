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
	private Client clientNo;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id")
	private Address addressNo;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id")
	private Property propertyNo;

	
	private double income;
	private Date leaseDate;
	private LeaseStatus leaseStatus;

	public Lease() {
	}
	
	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
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

	public Client getClientNo() {
		return clientNo;
	}

	public void setClientNo(Client clientNo) {
		this.clientNo = clientNo;
	}

	public Property getPropertyNo() {
		return propertyNo;
	}

	public void setPropertyNo(Property propertyNo) {
		this.propertyNo = propertyNo;
	}

	public Address getAddressNo() {
		return addressNo;
	}

	public void setAddressNo(Address addressNo) {
		this.addressNo = addressNo;
	}

	public Date getLeaseDate() {
		return leaseDate;
	}

	public void setLeaseDate(Date leaseDate) {
		this.leaseDate = leaseDate;
	}

}
