package property.org.mum.realEstate.domain;

import org.springframework.stereotype.Component;

@Component
public class Search {
	private int catId;
	private String name;
	private double price;


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
