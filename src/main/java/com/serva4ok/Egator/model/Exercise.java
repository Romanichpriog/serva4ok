package com.serva4ok.Egator.model;


import javax.persistence.*;

@Entity
@Table(name="exercise")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "text_zadania")
    private String textZadania;
    @Column(name = "varyantu_otveta")
    private String varyantyOtveta;
    @Column(name = "pravilnyi_otvet")
    private String otvet;
    @Column(name = "text")
    private String text;

    protected Exercise(){

    }

    public Exercise( String textZadania, String varyantyOtveta, String otvet, String text) {

        this.textZadania = textZadania;
        this.varyantyOtveta = varyantyOtveta;
        this.otvet = otvet;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTextZadania() {
        return textZadania;
    }

    public void setTextZadania(String textZadania) {
        this.textZadania = textZadania;
    }

    public String getVaryantyOtveta() {
        return varyantyOtveta;
    }

    public void setVaryantyOtveta(String varyantyOtveta) {
        this.varyantyOtveta = varyantyOtveta;
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

    @Override
    public String toString() {
        return String.format("Exercise[id=%d, textZadania='%s', variantyOtveta='%s', pravilnyOtvet='%s', text='%s']", id, textZadania, varyantyOtveta, otvet,text);
    }
}
