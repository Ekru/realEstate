package property.org.mum.realEstate.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(mappedBy="category")
    private List<Property> properties;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
