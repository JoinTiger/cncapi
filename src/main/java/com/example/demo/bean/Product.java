package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Product")
public class Product implements Serializable {

    private static final long serialVersionUID = 4963359130561432864L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "contractNum")
    private String contractNum;


    @Column(name = "ncNum")
    private String ncNum;

    @Column(name = "ncType")
    private String ncType;

    @Column(name = "ipcNum")
    private String ipcNum;

    @Column(name = "macSn")
    private String macSn;

    @Column(name = "batchId")
    private String batchId;

    @JsonIgnore
    @Column(name = "time")
    private Date time;


    @Transient
    private Standard standard;

    @Transient
    private Result result;

    @Transient
    private List<Motor> motors = new ArrayList<>();


    public Product() {
    }

    public Product(String contractNum, String ncNum, String ncType, String ipcNum, String macSn, String batchId, Date time, Standard standard, Result result, List<Motor> motors) {
        this.contractNum = contractNum;
        this.ncNum = ncNum;
        this.ncType = ncType;
        this.ipcNum = ipcNum;
        this.macSn = macSn;
        this.batchId = batchId;
        this.time = time;
        this.standard = standard;
        this.result = result;
        this.motors = motors;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public String getNcNum() {
        return ncNum;
    }

    public void setNcNum(String ncNum) {
        this.ncNum = ncNum;
    }

    public String getNcType() {
        return ncType;
    }

    public void setNcType(String ncType) {
        this.ncType = ncType;
    }

    public String getIpcNum() {
        return ipcNum;
    }

    public void setIpcNum(String ipcNum) {
        this.ipcNum = ipcNum;
    }

    public String getMacSn() {
        return macSn;
    }

    public void setMacSn(String macSn) {
        this.macSn = macSn;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public List<Motor> getMotors() {
        return motors;
    }

    public void setMotors(List<Motor> motors) {
        this.motors = motors;
    }
}
