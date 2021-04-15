package com.springboot.rest.api.service;

import com.springboot.rest.api.dto.AddressDto;
import com.springboot.rest.api.dto.UserDto;
import com.springboot.rest.api.entity.AddressEntity;
import com.springboot.rest.api.entity.UserEntity;
import com.springboot.rest.api.repository.AddressRepository;
import com.springboot.rest.api.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public AddressDto createAddress(AddressDto addressDto, String email) {
        UserEntity currentUser = userRepository.findByEmail(email);

        ModelMapper modelMapper = new ModelMapper();
        UserDto userDto = modelMapper.map(currentUser, UserDto.class);
        addressDto.setUser(userDto);

        AddressEntity addressEntity = modelMapper.map(addressDto, AddressEntity.class);

        AddressEntity addressEntity1 = addressRepository.save(addressEntity);

        AddressDto addressDto1 = modelMapper.map(addressEntity1, AddressDto.class);

        return addressDto1;
    }
}
