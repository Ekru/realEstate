package property.org.mum.realEstate.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SavedProperty {
	@Id
	@GeneratedValue
	private int id;
	private Date date;
	private Property property;
}
