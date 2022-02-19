package hu.webuni.spring.exam.mapper;

import hu.webuni.spring.exam.dto.AddressDto;
import hu.webuni.spring.exam.model.Address;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    List<AddressDto> addressesToDtos(List<Address> addresses);
    AddressDto addressToDto(Address address);
    Address dtoToAddress(AddressDto addressDto);
}
