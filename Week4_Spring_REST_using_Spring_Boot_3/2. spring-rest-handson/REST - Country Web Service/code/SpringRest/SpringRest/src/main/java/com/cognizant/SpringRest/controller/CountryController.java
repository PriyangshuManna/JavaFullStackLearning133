package com.cognizant.SpringRest.controller;

import com.cognizant.SpringRest.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {
        // Load India bean from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        return (Country) context.getBean("in");
    }
}

