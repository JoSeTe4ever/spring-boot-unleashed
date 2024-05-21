package com.jopisoft.unleashed.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jopisoft.unleashed.models.cryptocurrencies.Coin;
import com.jopisoft.unleashed.models.cryptocurrencies.enums.RapidApiHeaders;

@Service
public class CoinsService {

    @Autowired
    RestTemplate restTemplate;

    private final static String RAPID_API_COINS_URL = "https://coinranking1.p.rapidapi.com/coin/";
    private final static String RAPID_API_COINS_APIKEY = "886EKEGISYmsh0xKrQBlkj83tphgp1yJpb5jsn3zsyxwLsoZLN";
    private final static String RAPID_API_COINS_HOST = "coinranking1.p.rapidapi.com";

    public ResponseEntity<Coin> getCoinById(String id) {

        HttpHeaders headers = new HttpHeaders();
        headers.set(RapidApiHeaders.X_RAPIDAPI_KEY.getHeader(), RAPID_API_COINS_APIKEY);
        headers.set(RapidApiHeaders.X_RAPIDAPI_HOST.getHeader(), RAPID_API_COINS_HOST);

        // Build the request
        HttpEntity<String> entity = new HttpEntity<>(headers);
        try {
            ResponseEntity<Coin> response = restTemplate.exchange(RAPID_API_COINS_URL + id, HttpMethod.GET, entity,
                    Coin.class);

            if (response.getStatusCode().is2xxSuccessful() && response.hasBody()) {
                return response;
            } else {
                // Handle non-success status codes and empty body if necessary
                System.out.println("Request failed with status code: " + response.getStatusCode());
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
