package com.example.android_lab;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Animal implements Serializable {

    private int _id;
    private String gatunek;
    private String kolor;
    private float wielkość;
    private String opis;

    public Animal() {
    }

    public Animal(String gatunek, String kolor, float wielkość, String opis) {
        super();
        this.gatunek = gatunek;
        this.kolor = kolor;
        this.wielkość = wielkość;
        this.opis = opis;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public float getWielkość() {
        return wielkość;
    }

    public void setWielkość(float wielkość) {
        this.wielkość = wielkość;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Zwierze: [id= "+_id + ", gatunek= " + gatunek + ",kolor= "+kolor
                +" wielkosc= "+wielkość+" ]";
    }
}
