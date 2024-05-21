package com.jopisoft.unleashed.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.jopisoft.unleashed.models.cryptocurrencies.enums.RapidApiHeaders;

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
        HttpHeaders headers = new HttpHeaders();
        headers.set(RapidApiHeaders.X_RAPIDAPI_KEY.getHeader(), apiKey);
        headers.set(RapidApiHeaders.X_RAPIDAPI_HOST.getHeader(), host);

        // Build the request
        HttpEntity<String> entity = new HttpEntity<>(headers);

        try {
            // Use the `exchange` method for HTTP GET request with headers
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
            return response;
        } catch (HttpClientErrorException e) {
            // Handle HTTP errors
            System.out.println("An error occurred while requesting data: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
