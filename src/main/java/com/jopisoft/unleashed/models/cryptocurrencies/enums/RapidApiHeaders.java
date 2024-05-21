package com.jopisoft.unleashed.models.cryptocurrencies.enums;

public enum RapidApiHeaders {
    X_RAPIDAPI_KEY("X-RapidAPI-Key"),
    X_RAPIDAPI_HOST("X-RapidAPI-Host");

    private String header;

    RapidApiHeaders(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }
}