package com.springboot.rest.api.repository;

import com.springboot.rest.api.entity.AddressEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<AddressEntity, Long> {
}
