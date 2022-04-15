package com.demo.test_leak_demo.bean;

import java.util.Date;

public class InnerTestBean {

    private Integer testInt;
    private String testText;
    private Date testDate;

    public InnerTestBean() {
        super();
    }

    public Integer getTestInt() {
        return testInt;
    }

    public void setTestInt(Integer testInt) {
        this.testInt = testInt;
    }

    public String getTestText() {
        return testText;
    }

    public void setTestText(String testText) {
        this.testText = testText;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    @Override
    public String toString() {
        return "InnerTestBean [testInt=" + testInt + ", testText=" + testText + ", testDate=" + testDate + "]";
    }
}
