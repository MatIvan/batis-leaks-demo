package com.demo.test_leak_demo.bean;

import java.util.Date;

public class TestBean {
    private Integer id;
    private Integer testInt;
    private String testText;
    private Date testDate;
    private InnerTestBean innerTestBean;

    public TestBean() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public InnerTestBean getInnerTestBean() {
        return innerTestBean;
    }

    public void setInnerTestBean(InnerTestBean innerTestBean) {
        this.innerTestBean = innerTestBean;
    }

    @Override
    public String toString() {
        return "TestBean [id=" + id + ", testInt=" + testInt + ", testText=" + testText + ", testDate=" + testDate + ", innerTestBean=" + innerTestBean + "]";
    }

}
