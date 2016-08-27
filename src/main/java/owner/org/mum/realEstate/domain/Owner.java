package owner.org.mum.realEstate.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import property.org.mum.realEstate.domain.Address;
import property.org.mum.realEstate.domain.Property;

@Entity
public class Owner {
	@Id 
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	@OneToOne
	private Address address;
	private String telNumber;
	@OneToMany
	private List<Property> properties;
	
	public Owner(){
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public List<Property> getProperties() {
		return properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	
	
}
