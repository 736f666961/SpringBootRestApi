package com.springboot.rest.api.service;

import com.springboot.rest.api.dto.AddressDto;

public interface AddressService {
    AddressDto createAddress(AddressDto addressDto, String email);
}
