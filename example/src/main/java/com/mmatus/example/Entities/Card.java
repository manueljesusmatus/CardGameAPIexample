package com.mmatus.example.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="Cards")
public class Card implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
	@Column(name="ID")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description",length = 1200)
    private String desc;

    @Column(name="race")
    private String race;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="atk")
    private Integer atk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="def")
    private Integer def;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="level")
    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Column(name="attrribute")
    private String attribute;
    
    @Column(name="type")
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "banlist_id", referencedColumnName = "id_card", nullable=true)
    private Banlist banlist_info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "price_id", referencedColumnName = "id_card", nullable=true)
    private Price card_prices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "image_id")
    private List<Image> card_images = new ArrayList<>();

    public Card(){
    }


    public Card(long id, String name, String desc, String race, Integer atk, Integer def, Integer level, String attribute, String type, Banlist banlist_info, Price card_prices, List<Image> card_images) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.race = race;
        this.atk = atk;
        this.def = def;
        this.level = level;
        this.attribute = attribute;
        this.type = type;
        this.banlist_info = banlist_info;
        this.card_prices = card_prices;
        this.card_images = card_images;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getAtk() {
        return this.atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return this.def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Banlist getBanlist_info() {
        return this.banlist_info;
    }

    public void setBanlist_info(Banlist banlist_info) {
        this.banlist_info = banlist_info;
    }

    public Price getCard_prices() {
        return this.card_prices;
    }

    public void setCard_prices(Price card_prices) {
        this.card_prices = card_prices;
    }

    public List<Image> getCard_images() {
        return this.card_images;
    }

    public void setCard_images(List<Image> card_images) {
        this.card_images = card_images;
    }
    


}