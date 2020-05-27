package com.serva4ok.Egator.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nomer;
    private String textzadania;
    private String uslovie;
    private String otvet;
    private String text;

    public Exercise(){}

    public Exercise(String nomer, String textzadania, String uslovie, String otvet, String text) {
        this.nomer = nomer;
        this.textzadania = textzadania;
        this.uslovie = uslovie;
        this.otvet = otvet;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getTextzadania() {
        return textzadania;
    }

    public void setTextzadania(String textzadania) {
        this.textzadania = textzadania;
    }

    public String getUslovie() {
        return uslovie;
    }

    public void setUslovie(String uslovie) {
        this.uslovie = uslovie;
    }

    public String getOtvet() {
        return otvet;
    }

    public void setOtvet(String otvet) {
        this.otvet = otvet;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
