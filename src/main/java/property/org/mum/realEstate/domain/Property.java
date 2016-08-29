package property.org.mum.realEstate.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Property {
	@Id
	@GeneratedValue
	private int id;
	private String description;
	@OneToOne
	private Address address;
	@ManyToOne
	@JoinColumn(name = "category")
	private Category category;
	@OneToMany
	private List<Image> images;

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
