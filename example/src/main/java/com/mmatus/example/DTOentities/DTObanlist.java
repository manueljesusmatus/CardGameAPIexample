package com.mmatus.example.DTOentities;

public class DTObanlist {

    private long id_card;

    private String ban_goat;

    private String ban_ocg;
    
    private String ban_tcg;

    public DTObanlist(){

    }

    public DTObanlist(long id_card, String ban_goat, String ban_ocg, String ban_tcg) {
        this.id_card = id_card;
        this.ban_goat = ban_goat;
        this.ban_ocg = ban_ocg;
        this.ban_tcg = ban_tcg;
    }

    public long getId_card() {
        return this.id_card;
    }

    public void setId_card(long id_card) {
        this.id_card = id_card;
    }

    public String getBan_goat() {
        return this.ban_goat;
    }

    public void setBan_goat(String ban_goat) {
        this.ban_goat = ban_goat;
    }

    public String getBan_ocg() {
        return this.ban_ocg;
    }

    public void setBan_ocg(String ban_ocg) {
        this.ban_ocg = ban_ocg;
    }

    public String getBan_tcg() {
        return this.ban_tcg;
    }

    public void setBan_tcg(String ban_tcg) {
        this.ban_tcg = ban_tcg;
    }

}