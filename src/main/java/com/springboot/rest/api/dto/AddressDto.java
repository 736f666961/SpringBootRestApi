package com.springboot.rest.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class AddressDto {
    private long id;
    private String city;
    private String country;
    private UserDto user;
}
