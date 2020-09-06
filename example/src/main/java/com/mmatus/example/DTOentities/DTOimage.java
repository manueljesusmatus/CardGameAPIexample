package com.mmatus.example.DTOentities;

public class DTOimage {
    
    private long id;
    
    private String image_url;

    private String image_url_small;


    public DTOimage() {
    }


    public DTOimage(long id, String image_url, String image_url_small) {
        this.id = id;
        this.image_url = image_url;
        this.image_url_small = image_url_small;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
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