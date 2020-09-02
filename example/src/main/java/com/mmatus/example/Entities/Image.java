package com.mmatus.example.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Images")
public class Image implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
	@Column(name="ID")
    private long id;
    
    @Column(name="id_card")
    private long id_card;
    
    @Column(name="image_url")
    private String image_url;

    @Column(name="image_url_small")
    private String image_url_small;


    public Image() {
    }


    public Image(long id, long id_card, String image_url, String image_url_small) {
        this.id = id;
        this.id_card = id_card;
        this.image_url = image_url;
        this.image_url_small = image_url_small;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
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