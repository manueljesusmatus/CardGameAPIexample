package com.mmatus.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="Banlists")
public class Banlist {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
    private long id;
    
    @Column(name="id_card")
	private long id_card;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ban_goat")
	private String ban_goat;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
	@Column(name="ban_ocg")
    private String ban_ocg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="ban_tcg")
    private String ban_tcg;


    public Banlist(){
        
    }

    public Banlist(long id, long id_card, String ban_goat, String ban_ocg, String ban_tcg) {
        this.id = id;
        this.id_card = id_card;
        this.ban_goat = ban_goat;
        this.ban_ocg = ban_ocg;
        this.ban_tcg = ban_tcg;
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