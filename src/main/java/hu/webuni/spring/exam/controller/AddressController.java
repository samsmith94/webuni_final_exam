package hu.webuni.spring.exam.controller;

import hu.webuni.spring.exam.model.Address;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    //kell mapper, service hozzá
    /*
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    AddressDto createAddress(@RequestBody @Valid AddressDto addressDto) {
        Address newAddress = addressMapper.dtoToAddress(addressDto);
        addressService.createAddress(newAddress);
        return ...;
    }
     */

    /*
    @GetMapping
    List<AddressDto> getAll() {
        List<Address> addresses = addressService.getAllAddress();
        return addressMapper.addressToDtos(addresses);
    }
     */

    /*
    @GetMapping("/{id}")
    AddressDto getById(@PathVariable long id) {
        Address address = addressService.getAddressById(id);
        return addressMapper.addressToDto(address);
    }
     */

    /*
    @DeleteMapping("/{id}")
    void deleteAddress(@PathVariable long id) {
        addressService.deleteAddress(id);
    }
     */

    //KELL MÉG IDE A PUT!!!
}
