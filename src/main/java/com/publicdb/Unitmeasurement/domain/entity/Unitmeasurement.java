package com.publicdb.Unitmeasurement.domain.entity;

public class Unitmeasurement {
    private int idum;
    private String nameum;

    public Unitmeasurement(int idum, String nameum) {
        this.idum = idum;
        this.nameum = nameum;
    }
    
    public Unitmeasurement() {
    }
    public int getIdum() {
        return idum;
    }
    public void setIdum(int idum) {
        this.idum = idum;
    }
    public String getNameum() {
        return nameum;
    }
    public void setNameum(String nameum) {
        this.nameum = nameum;
    }
}
