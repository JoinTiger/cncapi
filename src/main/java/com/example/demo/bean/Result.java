package com.example.demo.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Result")
public class Result implements Serializable {

    private static final long serialVersionUID = -3343315822965677962L;

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

    @Column(name = "versionResult")
    private Boolean versionResult;

    @Column(name = "ncuResult")
    private Boolean ncuResult;

    @Column(name = "druResult")
    private Boolean druResult;

    @Column(name = "osResult")
    private Boolean osResult;

    @Column(name = "apiResult")
    private Boolean apiResult;

    @Column(name = "productId")
    private Long productId;

    public Result() {
    }

    public Result(String version, String ncu, String dru, String os, String api, Boolean versionResult, Boolean ncuResult, Boolean druResult, Boolean osResult, Boolean apiResult, Long productId) {
        this.version = version;
        this.ncu = ncu;
        this.dru = dru;
        this.os = os;
        this.api = api;
        this.versionResult = versionResult;
        this.ncuResult = ncuResult;
        this.druResult = druResult;
        this.osResult = osResult;
        this.apiResult = apiResult;
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

    public Boolean getVersionResult() {
        return versionResult;
    }

    public void setVersionResult(Boolean versionResult) {
        this.versionResult = versionResult;
    }

    public Boolean getNcuResult() {
        return ncuResult;
    }

    public void setNcuResult(Boolean ncuResult) {
        this.ncuResult = ncuResult;
    }

    public Boolean getDruResult() {
        return druResult;
    }

    public void setDruResult(Boolean druResult) {
        this.druResult = druResult;
    }

    public Boolean getOsResult() {
        return osResult;
    }

    public void setOsResult(Boolean osResult) {
        this.osResult = osResult;
    }

    public Boolean getApiResult() {
        return apiResult;
    }

    public void setApiResult(Boolean apiResult) {
        this.apiResult = apiResult;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
