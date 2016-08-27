package client.org.mum.realEstate.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import property.org.mum.realEstate.domain.Property;

@Entity
public class Lease {
	@Id
	@GeneratedValue
	private int leaseId;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "clientNo")
	private Client clientNo;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "propertyNo")
	private Property id;
	private Date leaseDate;
	private boolean leaseStatus;

	public Lease() {
	}

	

	public int getLeaseId() {
		return leaseId;
	}

	public boolean isLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(boolean leaseStatus) {
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
		return id;
	}

	public void setPropertyNo(Property propertyNo) {
		this.id = propertyNo;
	}

	public Date getLeaseDate() {
		return leaseDate;
	}

	public void setLeaseDate(Date leaseDate) {
		this.leaseDate = leaseDate;
	}

}
