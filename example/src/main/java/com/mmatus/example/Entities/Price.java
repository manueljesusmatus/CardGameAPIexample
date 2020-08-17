package com.mmatus.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Prices")
public class Price {

    @Id
    @Column(name="ID")
    private Long id;

    @Column(name="id_card")
    private Long idcard;

    @Column(name="amazon_price")
    private double amazon_price;

    @Column(name="cardmarket_price")
    private double cardmarket_price;

    @Column(name="coolstuffinc_price")
    private double coolstuffinc_price;

    @Column(name="ebay_price")
    private double ebay_price;

    @Column(name="tcgplayer_price")
    private double tcgplayer_price;


    public Price() {
    }


    public Price(Long id, Long idcard, double amazon_price, double cardmarket_price, double coolstuffinc_price, double ebay_price, double tcgplayer_price) {
        this.id = id;
        this.idcard = idcard;
        this.amazon_price = amazon_price;
        this.cardmarket_price = cardmarket_price;
        this.coolstuffinc_price = coolstuffinc_price;
        this.ebay_price = ebay_price;
        this.tcgplayer_price = tcgplayer_price;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdcard() {
        return this.idcard;
    }

    public void setIdcard(Long idcard) {
        this.idcard = idcard;
    }

    public double getAmazon_price() {
        return this.amazon_price;
    }

    public void setAmazon_price(double amazon_price) {
        this.amazon_price = amazon_price;
    }

    public double getCardmarket_price() {
        return this.cardmarket_price;
    }

    public void setCardmarket_price(double cardmarket_price) {
        this.cardmarket_price = cardmarket_price;
    }

    public double getCoolstuffinc_price() {
        return this.coolstuffinc_price;
    }

    public void setCoolstuffinc_price(double coolstuffinc_price) {
        this.coolstuffinc_price = coolstuffinc_price;
    }

    public double getEbay_price() {
        return this.ebay_price;
    }

    public void setEbay_price(double ebay_price) {
        this.ebay_price = ebay_price;
    }

    public double getTcgplayer_price() {
        return this.tcgplayer_price;
    }

    public void setTcgplayer_price(double tcgplayer_price) {
        this.tcgplayer_price = tcgplayer_price;
    }

    
}