package com.springboot.rest.api;

import com.springboot.rest.api.common.Utils;
import com.springboot.rest.api.dto.AddressDto;
import com.springboot.rest.api.dto.UserDto;
import com.springboot.rest.api.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@Autowired
	private UserService userService;

	// Instantiates userDto
	private UserDto userDto = new UserDto();

	// Instantiates address
	private AddressDto address = new AddressDto();

	@Test
	void contextLoads() {
		// Set location of sofia
		address.setCity("Sydney");
		address.setCountry("Australia");

		// Set first and last name
		userDto.setFirstName("sofia");
		userDto.setLastName("Tancredy");

		// Set sofia address
		userDto.setAddress(address);

		// Set email and password
		userDto.setEmail("sofia@gmail.com");
		userDto.setPassword("sofia1234");

		// Create user AKA sofia
		userService.createUser(userDto);

	}
}
