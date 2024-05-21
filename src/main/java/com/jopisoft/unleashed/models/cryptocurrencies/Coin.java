package com.jopisoft.unleashed.models.cryptocurrencies;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coins")
public class Coin {
    @Id
    @Column(name = "uuid")
    public String uuid;

    @Column(name = "symbol")
    public String symbol;

    @Column(name = "name")
    public String name;

    @Column(name = "description")
    public String description;

    @Column(name = "color")
    public String color;

    @Column(name = "icon_url")
    public String iconUrl;

    @Column(name = "website_url")
    public String websiteUrl;

    @Column(name = "links")
    public ArrayList<Link> links;

    @Column(name = "market_cap")
    public String marketCap;

    @Column(name = "fully_diluted_market_cap")
    public String fullyDilutedMarketCap;

    @Column(name = "price")
    public String price;

    @Column(name = "btc_price")
    public String btcPrice;

    @Column(name = "change")
    public String change;
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