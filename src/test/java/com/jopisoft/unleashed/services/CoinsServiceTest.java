package com.jopisoft.unleashed.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.jopisoft.unleashed.models.cryptocurrencies.Coin;
import com.jopisoft.unleashed.models.cryptocurrencies.enums.CoinSymbol;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CoinsServiceTest {

    @Autowired
    private CoinsService coinsService;

    @Test
    public void testCallForCoinById() {
        ResponseEntity<Coin> response = coinsService.getCoinById(CoinSymbol.BTC.toString());

        assertEquals(200, response.getStatusCodeValue());
        assertNotNull(response.getBody());
        // Add more assertions to check the response body
        // For example:
        // assertEquals("id", response.getBody().getUuid());
    }
}