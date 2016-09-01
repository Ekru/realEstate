package client.org.mum.realEstate.webService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import client.org.mum.realEstate.domain.Client;
import client.org.mum.realEstate.service.ClientService;
import client.org.mum.realEstate.service.LeaseService;
import property.org.mum.realEstate.Service.AddressService;
import property.org.mum.realEstate.Service.PropertyService;

@RestController

public class ClientRestController {
	@Autowired
	private PropertyService propertyService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private LeaseService leaseService;
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="/rest/client/{clientNo}",method=RequestMethod.GET)
	public @ResponseBody Client getClient(@PathVariable("clientNo") long clientNo) {
		return clientService.getClient(clientNo);
	}
	
	@RequestMapping(value = "/rest/client", method = RequestMethod.GET)
	public List<Client> getAllCategories() {
		return clientService.getAllClient();
	}
	
	
//	@RequestMapping(value="/rest/client", method=RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public @ResponseBody Client createClient(@RequestBody Client client) {
//		 clientService.addnewClient(client);
//		 return client;
//	}
		

	@RequestMapping(value = "/rest/client", method = RequestMethod.POST)
	public void AddNewCategory(@RequestBody Client client) {
		clientService.addnewClient(client);;
	}

	
	
}
