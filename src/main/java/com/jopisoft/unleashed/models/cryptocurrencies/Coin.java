package com.jopisoft.unleashed.models.cryptocurrencies;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "coins")
public class Coin implements Serializable {
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

    @OneToMany(mappedBy = "coin", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Link> links;

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