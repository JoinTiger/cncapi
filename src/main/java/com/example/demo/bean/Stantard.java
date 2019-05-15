package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Stantard")
public class Stantard implements Serializable {
    private static final long serialVersionUID = 1515940831789917303L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    @JsonProperty("id")
    private long id;

    @Column(name = "Version")
    @JsonProperty("version")
    private String version;
    @Column(name = "NCU")
    @JsonProperty("ncu")
    private String ncu;
    @Column(name = "DRU")
    @JsonProperty("dru")
    private String dru;
    @Column(name = "OS")
    @JsonProperty("os")
    private String os;
    @Column(name = "API")
    @JsonProperty("api")
    private String api;
    @Column(name = "ProductId")
    @JsonProperty("productId")
    private String productId;

    public Stantard() {
    }

    public Stantard(long id, String version, String ncu, String dru, String os, String api, String productId) {
        this.id = id;
        this.version = version;
        this.ncu = ncu;
        this.dru = dru;
        this.os = os;
        this.api = api;
        this.productId = productId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNcu() {
        return ncu;
    }

    public void setNcu(String ncu) {
        this.ncu = ncu;
    }

    public String getDru() {
        return dru;
    }

    public void setDru(String dru) {
        this.dru = dru;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
