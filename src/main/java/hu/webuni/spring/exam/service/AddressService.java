package hu.webuni.spring.exam.service;

import hu.webuni.spring.exam.dto.AddressDto;
import hu.webuni.spring.exam.model.Address;
import hu.webuni.spring.exam.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddress() {
        List<Address> addresses = addressRepository.findAll();
        return addresses;
    }

    public Address createAddress(Address address) {
        addressRepository.save(address);
        return address;
    }

    public Address getAddressById(Long id) {
        Optional<Address> addressFromDb = addressRepository.findById(id);
        if (addressFromDb.isPresent()) {
            return addressFromDb.get();
        } else {
            throw new RuntimeException();
            //TODO: TESTRESZABNI AZ EXCEPTION-T!!
        }
    }

    public Address updateAddress(Long id, Address address) {
        Optional<Address> addressFromDb = addressRepository.findById(id);
        if (addressFromDb.isPresent()) {
            Address _address = addressFromDb.get();
            _address.setCity(address.getCity());
            //_address.setLatitude()...
            //TODO: beállítani a többit is!!!

            return addressRepository.save(_address);
        } else {
            throw new RuntimeException();
            //TODO: TESTRESZABNI AZ EXCEPTION-T!!
        }
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }


}
