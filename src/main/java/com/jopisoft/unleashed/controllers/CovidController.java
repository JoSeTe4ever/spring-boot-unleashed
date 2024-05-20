package com.jopisoft.unleashed.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jopisoft.unleashed.services.CovidService;

@RestController
@RequestMapping("/covid")
public class CovidController {

    private final CovidService covidService;

    CovidController(CovidService covidService){
        this.covidService = covidService;
    }

    @RequestMapping("/get-all-country-covid-data")
    public ResponseEntity<?> callRapidEndpointToGetCovidData() {
        return ResponseEntity.ok(this.covidService.getAllCountryCovidData());
    }
    
}
