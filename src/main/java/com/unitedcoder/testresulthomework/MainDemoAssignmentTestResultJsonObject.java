package com.unitedcoder.testresulthomework;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainDemoAssignmentTestResultJsonObject {
    @JsonProperty("test-module")
    private String testModule;
    @JsonProperty("test-name")
    private String testName;
    @JsonProperty("test-date")
    private String testDate;
    @JsonProperty("test-time")
    private String testTime;
    @JsonProperty("test-status")
    private boolean testStatus;

    public MainDemoAssignmentTestResultJsonObject() {
    }

    public MainDemoAssignmentTestResultJsonObject(String testModule, String testName, String testDate, String testTime, boolean testStatus) {
        this.testModule = testModule;
        this.testName = testName;
        this.testDate = testDate;
        this.testTime = testTime;
        this.testStatus = testStatus;
    }

    public String getTestModule() {
        return testModule;
    }

    public String getTestName() {
        return testName;
    }

    public String getTestDate() {
        return testDate;
    }

    public String getTestTime() {
        return testTime;
    }

    public boolean isTestStatus() {
        return testStatus;
    }

    public void setTestModule(String testModule) {
        this.testModule = testModule;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public void setTestStatus(boolean testStatus) {
        this.testStatus = testStatus;
    }

    @Override
    public String toString() {
        return "AssignmentTestResultJsonObject{" +
                "testModule='" + testModule + '\'' +
                ", testName='" + testName + '\'' +
                ", testDate='" + testDate + '\'' +
                ", testTime='" + testTime + '\'' +
                ", testStatus=" + testStatus +
                '}';
    }
}
