package com.springboot.rest.api.entity;

import com.sun.istack.Nullable;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "UserEntity")
@Table(name = "users")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1754022545324503836L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name = "public_user_id")
    private String userId;

    @Column(nullable = false, length = 20)
    private String firstName;

    @Column(nullable = false, length = 20)
    private String lastName;

    @Column(nullable = false, length = 20, unique = true)
    private String email;

    @Column(nullable = false, length = 60)
    private String encryptedPassword;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private AddressEntity address;

    @Column(nullable = false)
    private String role = "USER";

}
