package owner.org.mum.realEstate.REST;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import client.org.mum.realEstate.service.ClientService;
import owner.org.mum.realEstate.domain.Owner;
import owner.org.mum.realEstate.service.OwnerService;

@RestController
@RequestMapping(value="rest")
public class OwnerRestController {

	@Autowired
	private OwnerService ownerService;
	
	
	@RequestMapping(value = "/owner/{id}", method = RequestMethod.GET)
	public ResponseEntity<Owner> getOwner(@PathVariable int id) {
		Owner owner = ownerService.getOwnerById(id);
		
		if(owner==null)
			return new ResponseEntity<Owner>(HttpStatus.NOT_FOUND);
		else {
			System.out.println("Fetching a user with id: "+id);
			return new ResponseEntity<Owner>(owner,HttpStatus.OK);
		}
	}
	@RequestMapping(value = "/owners", method = RequestMethod.GET)
	public ResponseEntity<List<Owner>> getAllOwners() {
		List<Owner> owners =ownerService.getOwners();
		 if(owners.isEmpty()){
	            return new ResponseEntity<List<Owner>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
		System.out.println("Fetching all owners.");
		return new ResponseEntity<List<Owner>>(owners,HttpStatus.OK);
	}
	@RequestMapping(value = "/addOwner", method = RequestMethod.POST)
	public ResponseEntity<Void>  addOwner(@RequestBody Owner owner) {
		System.out.println("adding  a user with id: "+owner.getId());
		ownerService.addNewOwner(owner);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/owner/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void>  editOwner(@PathVariable int id) {
		System.out.println("editting  an owner with id: "+id);
		ownerService.editOwnerById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	 //------------------- Delete a User --------------------------------------------------------
    
    @RequestMapping(value = "/owner/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteOwner(@PathVariable("id") int id) {
        System.out.println("Deleting  with id " + id);
        Owner owner =ownerService.getOwnerById(id);
        if(owner==null){
        	 return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } 
        ownerService.deleteOwnerById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
