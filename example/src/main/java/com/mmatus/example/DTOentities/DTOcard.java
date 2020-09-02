package com.mmatus.example.DTOentities;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DTOcard {

	private long id;
	
	private String name;
	
    private String desc;

    private String race;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer atk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer def;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute;
    
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DTObanlist banlist_info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DTOprice card_prices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DTOimage card_images;


    public DTOcard() {
    }

    public DTOcard(long id, String name, String desc, String race, Integer atk, Integer def, Integer level, String attribute, String type, DTObanlist banlist_info, DTOprice card_prices, DTOimage card_images) {
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

    public DTObanlist getBanlist_info() {
        return this.banlist_info;
    }

    public void setBanlist_info(DTObanlist banlist_info) {
        this.banlist_info = banlist_info;
    }

    public DTOprice getCard_prices() {
        return this.card_prices;
    }

    public void setCard_prices(DTOprice card_prices) {
        this.card_prices = card_prices;
    }

    public DTOimage getCard_images() {
        return this.card_images;
    }

    public void setCard_images(DTOimage card_images) {
        this.card_images = card_images;
    }
    

}