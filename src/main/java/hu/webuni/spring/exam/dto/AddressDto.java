package hu.webuni.spring.exam.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AddressDto {
    @JsonIgnore
    Long id;

    @NotNull
    String countryCode;
    String city;
    String postalCode;

    String street;
    String streetNumber;

    String latitude;

    //BigDecimal LON;
    String longitude;

}
