package com.mmatus.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    @Column(name="atk")
    private Integer atk;

    @Column(name="def")
    private Integer def;

    @Column(name="level")
    private Integer level;

    @Column(name="attrribute")
    private String attribute;
    
    @Column(name="type")
    private String type;


    public Card(){
    }


    public Card(Long id, String name, String desc, String race, Integer atk, Integer def, Integer level, String attribute, String type) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.race = race;
        this.atk = atk;
        this.def = def;
        this.level = level;
        this.attribute = attribute;
        this.type = type;
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

    public void setAttrribute(String attribute) {
        this.attribute = attribute;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


}