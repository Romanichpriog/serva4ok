package com.serva4ok.Egator.view;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "textzadania",
        "otvet",
        "nomer",
        "text",
        "uslovie"
})
public class JsonConvertor {

    @JsonProperty("textzadania")
    private String textzadania;
    @JsonProperty("otvet")
    private String otvet;
    @JsonProperty("nomer")
    private String nomer;
    @JsonProperty("text")
    private String text;
    @JsonProperty("uslovie")
    private String uslovie;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("textzadania")
    public String getTextzadania() {
        return textzadania;
    }

    @JsonProperty("textzadania")
    public void setTextzadania(String textzadania) {
        this.textzadania = textzadania;
    }

    @JsonProperty("otvet")
    public String getOtvet() {
        return otvet;
    }

    @JsonProperty("otvet")
    public void setOtvet(String otvet) {
        this.otvet = otvet;
    }

    @JsonProperty("nomer")
    public String getNomer() {
        return nomer;
    }

    @JsonProperty("nomer")
    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("uslovie")
    public String getUslovie() {
        return uslovie;
    }

    @JsonProperty("uslovie")
    public void setUslovie(String uslovie) {
        this.uslovie = uslovie;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}