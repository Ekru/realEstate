package property.org.mum.realEstate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import owner.org.mum.realEstate.domain.Owner;

@Entity
public class Property {
	@Id
	@GeneratedValue
	private int id;
	private double price;
	private String name;
	private boolean featured;
	private double area;
	private String description;
	@ManyToOne
	private Owner owner;
	@OneToOne
	private Address address;
	@ManyToOne
	@JoinColumn(name = "category")
	private Category category;

	public double getArea() {
		return area;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isFeatured() {
		return featured;
	}

	public void setFeatured(boolean featured) {
		this.featured = featured;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
