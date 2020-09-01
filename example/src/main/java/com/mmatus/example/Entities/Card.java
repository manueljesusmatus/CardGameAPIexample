package com.mmatus.example.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="Cards")
public class Card{
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

    public Card(){
    }

    public Card(long id, String name, String desc, String race, Integer atk, Integer def, Integer level, String attribute, String type, Banlist banlist_info) {
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
    }

    public long getId() {
        return this.id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String desc) {
        this.desc = desc;
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(final String race) {
        this.race = race;
    }

    public Integer getAtk() {
        return this.atk;
    }

    public void setAtk(final Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return this.def;
    }

    public void setDef(final Integer def) {
        this.def = def;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(final Integer level) {
        this.level = level;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public void setAttrribute(final String attribute) {
        this.attribute = attribute;
    }

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public Banlist getbanlist_info() {
        return this.banlist_info;
    }

    public void setbanlist_info(Banlist banlist) {
        this.banlist_info = banlist;
    }


}