package com.example.demo.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Standard")
public class Standard implements Serializable {

    private static final long serialVersionUID = -6387528293317798650L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "version")
    private String version;

    @Column(name = "ncu")
    private String ncu;

    @Column(name = "dru")
    private String dru;

    @Column(name = "os")
    private String os;

    @Column(name = "api")
    private String api;


    @Column(name = "productId")
    private Long productId;

    public Standard() {
    }

    public Standard(String version, String ncu, String dru, String os, String api, Long productId) {
        this.version = version;
        this.ncu = ncu;
        this.dru = dru;
        this.os = os;
        this.api = api;
        this.productId = productId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
