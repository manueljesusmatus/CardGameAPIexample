package com.mmatus.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tokens")
public class Token {

    @Id
	@Column(name="ID")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
    private String description;

    @Column(name="race")
    private String race;

    @Column(name="atk")
    private Integer atk;

    @Column(name="def")
    private Integer def;

    @Column(name="level")
    private Integer level;

    @Column(name="attrribute")
    private String attrribute;
    
    @Column(name="type")
    private String type;

    public Token(){

    }

    public Token(long id, String name, String description, String race, Integer atk, Integer def, Integer level, String attrribute, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.race = race;
        this.atk = atk;
        this.def = def;
        this.level = level;
        this.attrribute = attrribute;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getAttrribute() {
        return this.attrribute;
    }

    public void setAttrribute(String attrribute) {
        this.attrribute = attrribute;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


}