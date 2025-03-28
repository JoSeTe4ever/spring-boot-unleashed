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

/***
 * There is no restriction on the number of class files in a java file. But we
 * can't have more than one public class per source code file. Also the name of
 * the file must match the name of the public class.
 */

@Entity
@Table(name = "links")
class Link implements Serializable {

    @ManyToOne(targetEntity = Coin.class, fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
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