package com.publicdb.Modeadmin.domain.entity;

public class Modeadmin {
    private int id;
    private String descriptionmode;

    public Modeadmin() {
    }
    
    public Modeadmin(int id, String descriptionmode) {
        this.id = id;
        this.descriptionmode = descriptionmode;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescriptionmode() {
        return descriptionmode;
    }
    public void setDescriptionmode(String descriptionmode) {
        this.descriptionmode = descriptionmode;
    }
    
}
