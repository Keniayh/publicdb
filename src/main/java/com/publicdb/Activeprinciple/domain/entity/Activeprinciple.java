package com.publicdb.Activeprinciple.domain.entity;

public class Activeprinciple {
    private int idap;
    private String nameap;

    public Activeprinciple() {
    }

    public Activeprinciple(int idap, String nameap) {
        this.idap = idap;
        this.nameap = nameap;
    }

    public int getIdap() {
        return idap;
    }

    public void setId(int idap) {
        this.idap = idap;
    }

    public String getNameap() {
        return nameap;
    }

    public void setNameap(String nameap) {
        this.nameap = nameap;
    }
}
