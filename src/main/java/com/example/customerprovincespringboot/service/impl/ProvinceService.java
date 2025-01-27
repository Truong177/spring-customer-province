package com.example.customerprovincespringboot.service.impl;

import com.example.customerprovincespringboot.model.Customer;
import com.example.customerprovincespringboot.model.Province;
import com.example.customerprovincespringboot.repository.IProvinceRepository;
import com.example.customerprovincespringboot.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }


}
