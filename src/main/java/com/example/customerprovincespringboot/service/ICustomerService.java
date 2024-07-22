package com.example.customerprovincespringboot.service;

import com.example.customerprovincespringboot.model.Customer;
import com.example.customerprovincespringboot.model.Province;

public interface ICustomerService extends IGenerateService<Customer> {

    Iterable<Customer> findAllByProvince(Province province);
}
