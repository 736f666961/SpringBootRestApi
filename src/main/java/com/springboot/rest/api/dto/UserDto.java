package com.springboot.rest.api.dto;

import com.springboot.rest.api.request.AddressRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class UserDto implements Serializable {
    private static final long serialVersionUID = -5599795549692861981L;

    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
    private AddressDto address;

}
