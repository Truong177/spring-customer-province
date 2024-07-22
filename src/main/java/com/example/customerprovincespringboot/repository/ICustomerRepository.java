package com.example.customerprovincespringboot.repository;

import com.example.customerprovincespringboot.model.Customer;
import com.example.customerprovincespringboot.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
