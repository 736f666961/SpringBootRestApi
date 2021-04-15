package com.springboot.rest.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class AddressRequest {
    @NotBlank(message = "City cannot left blank")
    private String city;

//    @NotBlank(message = "Country cannot left blank")
    private String country;
}
