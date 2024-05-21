package com.jopisoft.unleashed.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jopisoft.unleashed.models.cryptocurrencies.Coin;

@Service
public class CoinsService {

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<Coin> callForCoinById(String id) {

        try {
            ResponseEntity<Coin> response = restTemplate.getForEntity("https://api.coingecko.com/api/v3/coins/" + id,
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
