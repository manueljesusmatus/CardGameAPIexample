package com.mmatus.example.DTOentities;

public class DTOimage {
    
    private long id_card;
    
    private String image_url;

    private String image_url_small;


    public DTOimage() {
    }


    public DTOimage(long id_card, String image_url, String image_url_small) {
        this.id_card = id_card;
        this.image_url = image_url;
        this.image_url_small = image_url_small;
    }

    public long getId_card() {
        return this.id_card;
    }

    public void setId_card(long id_card) {
        this.id_card = id_card;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getImage_url_small() {
        return this.image_url_small;
    }

    public void setImage_url_small(String image_url_small) {
        this.image_url_small = image_url_small;
    }


}