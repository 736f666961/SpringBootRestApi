package com.springboot.rest.api.repository;

import com.springboot.rest.api.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
    UserEntity findByUserId(String userId);

    @Query("SELECT u FROM UserEntity u WHERE u.firstName = 'sofia'")
    Page<UserEntity> findAllUsersByFirstName(Pageable pageable);

}
