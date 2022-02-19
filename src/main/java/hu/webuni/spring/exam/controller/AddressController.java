package hu.webuni.spring.exam.controller;

import hu.webuni.spring.exam.dto.AddressDto;
import hu.webuni.spring.exam.mapper.AddressMapper;
import hu.webuni.spring.exam.model.Address;
import hu.webuni.spring.exam.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    @Autowired
    AddressMapper addressMapper;

    @Autowired
    AddressService addressService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    AddressDto createAddress(@RequestBody @Valid AddressDto addressDto) {
        Address newAddress = addressMapper.dtoToAddress(addressDto);
        addressService.createAddress(newAddress);
        return addressDto;
    }

    @GetMapping
    List<AddressDto> getAll() {
        List<Address> addresses = addressService.getAllAddress();
        return addressMapper.addressesToDtos(addresses);
    }

    @GetMapping("/{id}")
    AddressDto getById(@PathVariable long id) {
        Address address = addressService.getAddressById(id);
        return addressMapper.addressToDto(address);
    }

    @DeleteMapping("/{id}")
    void deleteAddress(@PathVariable long id) {
        addressService.deleteAddress(id);
    }

    @PutMapping("/{id}")
    AddressDto updateAddress(@PathVariable long id, @RequestBody @Valid AddressDto addressDto) {
        Address addressToUpdate = addressMapper.dtoToAddress(addressDto);
        addressService.updateAddress(id, addressToUpdate);
        return addressDto;
    }
}
