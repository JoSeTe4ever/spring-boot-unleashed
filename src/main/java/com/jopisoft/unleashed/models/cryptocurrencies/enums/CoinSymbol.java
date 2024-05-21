package com.jopisoft.unleashed.models.cryptocurrencies.enums;

public enum CoinSymbol {
    
    BTC("Qwsogvtv82FCd"),
    ETH("razxDUgYGNAdQ"),
    LTC("D7B1x_ks7WhV5"),
    XRP("-l8Mn2pVlRs-p"),
    BCH("ZlZpzOJo43mIo"),
    BNB("WcwrkfNI4FUAe"),
    USDT("HIVsRcGKkPFtW");

    private final String uuid;

    CoinSymbol(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }
}