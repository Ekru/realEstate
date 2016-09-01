package property.org.mum.realEstate.webService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import property.org.mum.realEstate.Service.PropertyService;
import property.org.mum.realEstate.domain.Property;

@RestController
@RequestMapping("/WebService/Rest")
public class PropertyRestController {
	/*
	 * @RequestMapping(value="/property",method=RequestMethod.GET)
	 * 
	 * @RequestMapping(value="/property",method=RequestMethod.POST)
	 * 
	 * @RequestMapping(value="/property/{propertyId}",method=RequestMethod.GET)
	 * 
	 * @RequestMapping(value="/property/{propertyId}",method=RequestMethod.PUT)
	 * 
	 * @RequestMapping(value="/property/{propertyId}",method=RequestMethod.
	 * DELETE)
	 */
	@Autowired
	private PropertyService pService;

	@RequestMapping(value = "/property", method = RequestMethod.GET)
	public List<Property> getAllProperties() {
		return pService.getAllProperies();
	}

	@RequestMapping(value = "/property", method = RequestMethod.POST)
	public void addNewProperty(@RequestBody Property property) {
		pService.addNewProperty(property);
	}

	@RequestMapping(value = "/property/{propertyId}", method = RequestMethod.GET)
	public Property getPropertyById(@PathVariable("propertyId") int propertyId) {
		return pService.getPropertyById(propertyId);
	}

	@RequestMapping(value = "/property/{propertyId}", method = RequestMethod.PUT)
	public Property UpdateProperty(@PathVariable("propertyId") int propertyId, @RequestBody Property property) {
		return pService.updateProperty(propertyId, property);
	}

	@RequestMapping(value = "/property/{propertyId}", method = RequestMethod.DELETE)
	public void deleteProperty(@PathVariable("propertyId") int propertyId) {

	}
}
