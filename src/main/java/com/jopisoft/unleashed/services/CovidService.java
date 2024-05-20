package com.jopisoft.unleashed.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidService {

    private final static String url = "https://corona-virus-world-and-india-data.p.rapidapi.com/api";
    private final static String apiKey = "886EKEGISYmsh0xKrQBlkj83tphgp1yJpb5jsn3zsyxwLsoZLN";
    private final static String host = "corona-virus-world-and-india-data.p.rapidapi.com";


    @Autowired  
    private RestTemplate restTemplate;

    /**
     * This method is used to get all country covid data
     * 
     * @return
     */
    public Object getAllCountryCovidData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCountryCovidData'");
    }
    
}
