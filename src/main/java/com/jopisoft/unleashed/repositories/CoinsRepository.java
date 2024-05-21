package com.jopisoft.unleashed.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jopisoft.unleashed.models.cryptocurrencies.Coin;

public interface CoinsRepository extends JpaRepository<Coin, Long> {

    
}
