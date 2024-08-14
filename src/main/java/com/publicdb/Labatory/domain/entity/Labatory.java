package com.publicdb.Labatory.domain.entity;

public class Labatory {
    private int id;
    private String namelab;
    private String codecityreg;

    public labatory() {
    }
    
    public Labatory(int id, String namelab, String codecityreg) {
        this.id = id;
        this.namelab = namelab;
        this.codecityreg = codecityreg;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNamelab() {
        return namelab;
    }
    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }
    public String getCodecityreg() {
        return codecityreg;
    }
    public void setCodecityreg(String codecityreg) {
        this.codecityreg = codecityreg;
    }
}
