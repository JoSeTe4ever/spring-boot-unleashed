package com.jopisoft.unleashed.models.cryptocurrencies;

import java.io.Serializable;
import java.util.ArrayList;
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

/***
 * There is no restriction on the number of class files in a java file. But we
 * can't have more than one public class per source code file. Also the name of
 * the file must match the name of the public class.
 */

 @Entity
 @Table(name = "links")
 class Link implements Serializable {
 
     @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
     @JoinColumn(name = "coin_id", referencedColumnName = "uuid")
     private Coin coin;
 
     @Column(name = "name")
     public String name;
 
     @Id
     @Column(name = "url")
     public String url;
 
     @Column(name = "type")
     public String type;
 
     public Link() {
     }
 
     public Link(String name, String url, String type) {
         this.name = name;
         this.url = url;
         this.type = type;
     }
 
     public Coin getCoin() {
         return coin;
     }
 
     public void setCoin(Coin coin) {
         this.coin = coin;
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public String getUrl() {
         return url;
     }
 
     public void setUrl(String url) {
         this.url = url;
     }
 
     public String getType() {
         return type;
     }
 
     public void setType(String type) {
         this.type = type;
     }
 }