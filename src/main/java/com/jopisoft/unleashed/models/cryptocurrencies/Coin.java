package com.jopisoft.unleashed.models.cryptocurrencies;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "coins")
public class Coin {
    public String uuid;
    public String symbol;
    public String name;
    public String description;
    public String color;
    public String iconUrl;
    public String websiteUrl;
    public ArrayList<Link> links;
    public int numberOfMarkets;
    public int numberOfExchanges;
    @JsonProperty("24hVolume")
    public String _24hVolume;
    public String marketCap;
    public String fullyDilutedMarketCap;
    public String price;
    public String btcPrice;
    public int priceAt;
    public String change;
    public int rank;
    public String coinrankingUrl;
    public int tier;
    public boolean lowVolume;
    public int listedAt;
    public boolean hasContent;
    public Object notices;
}

/***
 * There is no restriction on the number of class files in a java file. But we
 * can't have more than one public class per source code file. Also the name of
 * the file must match the name of the public class.
 */

class Link {
    public String name;
    public String url;
    public String type;
}