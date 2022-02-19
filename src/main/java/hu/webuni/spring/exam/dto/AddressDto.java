package hu.webuni.spring.exam.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AddressDto {

    Long id;

    String ISOCountryCode;
    String city;
    String postalCode;

    String street;
    String streetNumber;

    String latitude;

    //BigDecimal LON;
    String longitude;

}
