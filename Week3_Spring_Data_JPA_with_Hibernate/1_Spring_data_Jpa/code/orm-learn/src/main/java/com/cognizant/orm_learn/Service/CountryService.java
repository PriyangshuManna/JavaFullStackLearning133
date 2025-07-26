package com.cognizant.orm_learn.Service;

import com.cognizant.orm_learn.CountryRepository.CountryRepo;
import com.cognizant.orm_learn.model.Country;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CountryService {
    @Autowired
    private CountryRepo countryRepo;

    @Transactional
    public List<Country> getAllCountry(){
        return countryRepo.findAll();
    }
}
