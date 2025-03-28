package com.jopisoft.unleashed.models.cryptocurrencies;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "price",
        "timestamp"
})
public class CoinPrice implements Serializable{

    @JsonProperty("coin_name")
    private String coinName;

    @JsonProperty("price")
    private String price;

    @Id
    @JsonProperty("timestamp")
    private long timestamp;

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    public CoinPrice withPrice(String price) {
        this.price = price;
        return this;
    }

    @JsonProperty("timestamp")
    public long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public CoinPrice withTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("coin_name")
    public String getCoinName() {
        return coinName;
    }

    @JsonProperty("coin_name")
    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }
}