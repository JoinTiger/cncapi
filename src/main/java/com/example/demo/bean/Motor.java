package com.example.demo.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Motor")
public class Motor implements Serializable {

    private static final long serialVersionUID = 1880149219690551438L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "servoType")
    private String servoType;

    @Column(name = "servoNum")
    private String servoNum;

    @Column(name = "motorNum")
    private String motorNum;

    @Column(name = "axleName")
    private String axleName;

    @Column(name = "motorAttributes")
    private String motorAttributes;

    @Column(name = "max")
    private Double max;

    @Column(name = "min")
    private Double min;

    @Column(name = "average")
    private Double average;

    @Column(name = "present")
    private Double present;

    @Column(name = "productId")
    private Long productId;

    public Motor() {
    }

    public Motor(String servoType, String servoNum, String motorNum, String axleName, String motorAttributes, Double max, Double min, Double average, Double present, Long productId) {
        this.servoType = servoType;
        this.servoNum = servoNum;
        this.motorNum = motorNum;
        this.axleName = axleName;
        this.motorAttributes = motorAttributes;
        this.max = max;
        this.min = min;
        this.average = average;
        this.present = present;
        this.productId = productId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServoType() {
        return servoType;
    }

    public void setServoType(String servoType) {
        this.servoType = servoType;
    }

    public String getServoNum() {
        return servoNum;
    }

    public void setServoNum(String servoNum) {
        this.servoNum = servoNum;
    }

    public String getMotorNum() {
        return motorNum;
    }

    public void setMotorNum(String motorNum) {
        this.motorNum = motorNum;
    }

    public String getAxleName() {
        return axleName;
    }

    public void setAxleName(String axleName) {
        this.axleName = axleName;
    }

    public String getMotorAttributes() {
        return motorAttributes;
    }

    public void setMotorAttributes(String motorAttributes) {
        this.motorAttributes = motorAttributes;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Double getPresent() {
        return present;
    }

    public void setPresent(Double present) {
        this.present = present;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
