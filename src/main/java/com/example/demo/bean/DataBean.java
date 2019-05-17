package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataBean implements Serializable {

    private static final long serialVersionUID = -7476917480855025563L;

    private Long uploadTime;

    private Integer version;

    private Integer macAxNum;

    private String macModel;

    private String macNO;

    private String macSN;

    private String ipcCode;

    private String contractCode;

    private String customerName;

    private String loginName;

    private NcVer ncVer;

    @JsonProperty("servoVer")
    private List<Servo> servos = new ArrayList<>();


    private List<ElecDataList> elecDataList = new ArrayList<>();


}





class ElecDataList implements Serializable {

    private static final long serialVersionUID = 8665530290836983629L;


    private AxServo axServo;

    private MinMaxAveCur accTime;

    private MinMaxAveCur accElecFF;

    private MinMaxAveCur accElecPulse;

    private MinMaxAveCur accMaxFollowRate;

    private MinMaxAveCur decTime;

    private MinMaxAveCur decElecFF;

    private MinMaxAveCur decElecPulse;

    private MinMaxAveCur decMaxFollowRate;

    private MinMaxAveCur constMaxFollowRate;

    private MinMaxAveCur constElecRMS;

    private MinMaxAveCur constElecRMSMag;

    private MinMaxAveCur constElecVariance;

    private MinMaxAveCur constElecSkewness;

    private MinMaxAveCur constElecKurtosis;

    private MinMaxAveCur constElecWaveQuota;

    private MinMaxAveCur constElecMarginQuota;

    public ElecDataList() {
    }

    public ElecDataList(AxServo axServo, MinMaxAveCur accTime, MinMaxAveCur accElecFF, MinMaxAveCur accElecPulse, MinMaxAveCur accMaxFollowRate, MinMaxAveCur decTime, MinMaxAveCur decElecFF, MinMaxAveCur decElecPulse, MinMaxAveCur decMaxFollowRate, MinMaxAveCur constMaxFollowRate, MinMaxAveCur constElecRMS, MinMaxAveCur constElecRMSMag, MinMaxAveCur constElecVariance, MinMaxAveCur constElecSkewness, MinMaxAveCur constElecKurtosis, MinMaxAveCur constElecWaveQuota, MinMaxAveCur constElecMarginQuota) {
        this.axServo = axServo;
        this.accTime = accTime;
        this.accElecFF = accElecFF;
        this.accElecPulse = accElecPulse;
        this.accMaxFollowRate = accMaxFollowRate;
        this.decTime = decTime;
        this.decElecFF = decElecFF;
        this.decElecPulse = decElecPulse;
        this.decMaxFollowRate = decMaxFollowRate;
        this.constMaxFollowRate = constMaxFollowRate;
        this.constElecRMS = constElecRMS;
        this.constElecRMSMag = constElecRMSMag;
        this.constElecVariance = constElecVariance;
        this.constElecSkewness = constElecSkewness;
        this.constElecKurtosis = constElecKurtosis;
        this.constElecWaveQuota = constElecWaveQuota;
        this.constElecMarginQuota = constElecMarginQuota;
    }


    public AxServo getAxServo() {
        return axServo;
    }

    public void setAxServo(AxServo axServo) {
        this.axServo = axServo;
    }

    public MinMaxAveCur getAccTime() {
        return accTime;
    }

    public void setAccTime(MinMaxAveCur accTime) {
        this.accTime = accTime;
    }

    public MinMaxAveCur getAccElecFF() {
        return accElecFF;
    }

    public void setAccElecFF(MinMaxAveCur accElecFF) {
        this.accElecFF = accElecFF;
    }

    public MinMaxAveCur getAccElecPulse() {
        return accElecPulse;
    }

    public void setAccElecPulse(MinMaxAveCur accElecPulse) {
        this.accElecPulse = accElecPulse;
    }

    public MinMaxAveCur getAccMaxFollowRate() {
        return accMaxFollowRate;
    }

    public void setAccMaxFollowRate(MinMaxAveCur accMaxFollowRate) {
        this.accMaxFollowRate = accMaxFollowRate;
    }

    public MinMaxAveCur getDecTime() {
        return decTime;
    }

    public void setDecTime(MinMaxAveCur decTime) {
        this.decTime = decTime;
    }

    public MinMaxAveCur getDecElecFF() {
        return decElecFF;
    }

    public void setDecElecFF(MinMaxAveCur decElecFF) {
        this.decElecFF = decElecFF;
    }

    public MinMaxAveCur getDecElecPulse() {
        return decElecPulse;
    }

    public void setDecElecPulse(MinMaxAveCur decElecPulse) {
        this.decElecPulse = decElecPulse;
    }

    public MinMaxAveCur getDecMaxFollowRate() {
        return decMaxFollowRate;
    }

    public void setDecMaxFollowRate(MinMaxAveCur decMaxFollowRate) {
        this.decMaxFollowRate = decMaxFollowRate;
    }

    public MinMaxAveCur getConstMaxFollowRate() {
        return constMaxFollowRate;
    }

    public void setConstMaxFollowRate(MinMaxAveCur constMaxFollowRate) {
        this.constMaxFollowRate = constMaxFollowRate;
    }

    public MinMaxAveCur getConstElecRMS() {
        return constElecRMS;
    }

    public void setConstElecRMS(MinMaxAveCur constElecRMS) {
        this.constElecRMS = constElecRMS;
    }

    public MinMaxAveCur getConstElecRMSMag() {
        return constElecRMSMag;
    }

    public void setConstElecRMSMag(MinMaxAveCur constElecRMSMag) {
        this.constElecRMSMag = constElecRMSMag;
    }

    public MinMaxAveCur getConstElecVariance() {
        return constElecVariance;
    }

    public void setConstElecVariance(MinMaxAveCur constElecVariance) {
        this.constElecVariance = constElecVariance;
    }

    public MinMaxAveCur getConstElecSkewness() {
        return constElecSkewness;
    }

    public void setConstElecSkewness(MinMaxAveCur constElecSkewness) {
        this.constElecSkewness = constElecSkewness;
    }

    public MinMaxAveCur getConstElecKurtosis() {
        return constElecKurtosis;
    }

    public void setConstElecKurtosis(MinMaxAveCur constElecKurtosis) {
        this.constElecKurtosis = constElecKurtosis;
    }

    public MinMaxAveCur getConstElecWaveQuota() {
        return constElecWaveQuota;
    }

    public void setConstElecWaveQuota(MinMaxAveCur constElecWaveQuota) {
        this.constElecWaveQuota = constElecWaveQuota;
    }

    public MinMaxAveCur getConstElecMarginQuota() {
        return constElecMarginQuota;
    }

    public void setConstElecMarginQuota(MinMaxAveCur constElecMarginQuota) {
        this.constElecMarginQuota = constElecMarginQuota;
    }
}


class AxServo implements Serializable {

    private static final long serialVersionUID = -7922877748141567466L;

    private String axisName;

    private String servoId;

    private String elecId;

    private String servoModel;

    private String elecModel;

    public AxServo() {
    }

    public AxServo(String axisName, String servoId, String elecId, String servoModel, String elecModel) {
        this.axisName = axisName;
        this.servoId = servoId;
        this.elecId = elecId;
        this.servoModel = servoModel;
        this.elecModel = elecModel;
    }


    public String getAxisName() {
        return axisName;
    }

    public void setAxisName(String axisName) {
        this.axisName = axisName;
    }

    public String getServoId() {
        return servoId;
    }

    public void setServoId(String servoId) {
        this.servoId = servoId;
    }

    public String getElecId() {
        return elecId;
    }

    public void setElecId(String elecId) {
        this.elecId = elecId;
    }

    public String getServoModel() {
        return servoModel;
    }

    public void setServoModel(String servoModel) {
        this.servoModel = servoModel;
    }

    public String getElecModel() {
        return elecModel;
    }

    public void setElecModel(String elecModel) {
        this.elecModel = elecModel;
    }
}

class MinMaxAveCur implements Serializable {

    private static final long serialVersionUID = -627597604350146446L;

    private Double min;
    private Double max;
    private Double average;
    private Double cur;

    public MinMaxAveCur() {
    }

    public MinMaxAveCur(Double min, Double max, Double average, Double cur) {
        this.min = min;
        this.max = max;
        this.average = average;
        this.cur = cur;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Double getCur() {
        return cur;
    }

    public void setCur(Double cur) {
        this.cur = cur;
    }
}
