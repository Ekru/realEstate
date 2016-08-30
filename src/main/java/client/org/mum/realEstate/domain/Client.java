package client.org.mum.realEstate.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import property.org.mum.realEstate.domain.Address;
@Entity
public class Client {

		@Id @GeneratedValue
		private long customerNo; 
		private String firstName; 
		private String lastName;
		private String email; 
		private String phone; 
		@OneToOne
		@JoinColumn(name = "id")
		private Address address;
		
		
		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public Client(){}
		
		public Client(String fname,String lname,String email,String phone){
			this.firstName=fname;
			this.lastName = lname;
			this.email=email;
			this.phone=phone;
			
		}

		public long getCustomerNo() {
			return customerNo;
		}

		public void setCustomerNo(long customerNo) {
			this.customerNo = customerNo;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

}
