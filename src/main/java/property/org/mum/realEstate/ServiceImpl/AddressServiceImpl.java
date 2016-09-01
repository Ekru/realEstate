package property.org.mum.realEstate.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import property.org.mum.realEstate.DAO.AddressDAO;
import property.org.mum.realEstate.Service.AddressService;
import property.org.mum.realEstate.domain.Address;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDAO addressDAO;

	public void saveAddress(Address address) {

		addressDAO.save(address);
	}

	public void deleteAddress(int id) {

		addressDAO.delete(id);
		
	}

	public Address getAddressByZip(String zip) {

		return addressDAO.getOne(Integer.parseInt(zip));
	}

	public List<Address> getALLAddresses() {

		return addressDAO.findAll();
	}

}