package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;
    
    @GetMapping("/brands")
    public List<Brand> getBrands(){
        List<Brand> brands = brandService.getBrands();
        return brands;
    }
}
