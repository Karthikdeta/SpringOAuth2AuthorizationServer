package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
    
    @Autowired
    private BrandRepository brandRepository;
    
    public List<Brand> getBrands() {
        List<Brand> brands = brandRepository.findAll();
        return brands;
    }

}
