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
    private String nomerZadania;
    private String textZadania;
    private String usLovie;
    private String otvet;
    private String textDop;
    public Exercise(){}
    public Exercise(String nomerZadania, String textZadania, String usLovie, String otvet, String textDop) {
        this.nomerZadania = nomerZadania;
        this.textZadania = textZadania;
        this.usLovie = usLovie;
        this.otvet = otvet;
        this.textDop = textDop;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomerZadania() {
        return nomerZadania;
    }

    public void setNomerZadania(String nomerZadania) {
        this.nomerZadania = nomerZadania;
    }

    public String getTextZadania() {
        return textZadania;
    }

    public void setTextZadania(String textZadania) {
        this.textZadania = textZadania;
    }

    public String getUsLovie() {
        return usLovie;
    }

    public void setUsLovie(String usLovie) {
        this.usLovie = usLovie;
    }

    public String getOtvet() {
        return otvet;
    }

    public void setOtvet(String otvet) {
        this.otvet = otvet;
    }

    public String getTextDop() {
        return textDop;
    }

    public void setTextDop(String textDop) {
        this.textDop = textDop;
    }

}
