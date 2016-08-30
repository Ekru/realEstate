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
	@Override
	public void saveAddress(Address address) {
		// TODO Auto-generated method stub
		addressDAO.save(address);
	}

	@Override
	public void deleteAddress(int id) {
		// TODO Auto-generated method stub
		addressDAO.delete(id);;
	}

	@Override
	public Address getAddressByZip(String zip) {
		// TODO Auto-generated method stub
		return addressDAO.getOne(Integer.parseInt(zip));
	}

	@Override
	public List<Address> getALLAddresses() {
		// TODO Auto-generated method stub
		return addressDAO.findAll();
	}
 

}
