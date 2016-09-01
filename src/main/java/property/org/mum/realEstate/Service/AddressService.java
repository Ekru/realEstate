package property.org.mum.realEstate.Service;

import java.util.List;

import property.org.mum.realEstate.domain.Address;

public interface AddressService {
	void saveAddress(Address address);
	void deleteAddress(int id);
	Address getAddressByZip(String zip);
	List<Address> getALLAddresses();

}