package property.org.mum.realEstate.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import client.org.mum.realEstate.domain.Client;

@Entity
public class SavedProperty {
	@Id
	@GeneratedValue
	private int id;
	private Date date;
	@OneToOne
	private Property property;
	@ManyToOne
	private Client client;

	public SavedProperty() {
	}

	public SavedProperty(Date date, Property property, Client client) {
		super();
		this.date = date;
		this.property = property;
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

}
