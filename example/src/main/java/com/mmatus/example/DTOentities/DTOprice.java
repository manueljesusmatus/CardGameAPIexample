package com.mmatus.example.DTOentities;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DTOprice {

    private Long id_card;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double amazon_price;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double cardmarket_price;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double coolstuffinc_price;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double ebay_price;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double tcgplayer_price;

    public DTOprice(){

    }

    public DTOprice(Long id_card, double amazon_price, double cardmarket_price, double coolstuffinc_price, double ebay_price, double tcgplayer_price) {
        this.id_card = id_card;
        this.amazon_price = amazon_price;
        this.cardmarket_price = cardmarket_price;
        this.coolstuffinc_price = coolstuffinc_price;
        this.ebay_price = ebay_price;
        this.tcgplayer_price = tcgplayer_price;
    }

    public Long getId_card() {
        return this.id_card;
    }

    public void setId_card(Long id_card) {
        this.id_card = id_card;
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