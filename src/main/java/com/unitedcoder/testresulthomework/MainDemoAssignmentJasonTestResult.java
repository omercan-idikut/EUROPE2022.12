package com.unitedcoder.testresulthomework;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MainDemoAssignmentJasonTestResult {
    @JsonProperty("test-start-time")
    private String testStartTime;
    @JsonProperty("test-end-time")
    private String testEndTime;
    @JsonProperty("test-excuted-by")
    private String testExcutedBy;
    @JsonProperty("tests")
    private List<MainDemoAssignmentTestResultJsonObject> testResultJsonObjectList;
    public MainDemoAssignmentJasonTestResult() {
    }

    public MainDemoAssignmentJasonTestResult(List<MainDemoAssignmentTestResultJsonObject> testResultJsonObjectList, String testStartTime, String testEndTime, String testExcutedBy) {

        this.testStartTime = testStartTime;
        this.testEndTime = testEndTime;
        this.testExcutedBy = testExcutedBy;
        this.testResultJsonObjectList = testResultJsonObjectList;
    }

    public List<MainDemoAssignmentTestResultJsonObject> getTestResultJsonObjectList() {
        return testResultJsonObjectList;
    }

    public String getTestStartTime() {
        return testStartTime;
    }

    public String getTestEndTime() {
        return testEndTime;
    }

    public String getTestExcutedBy() {
        return testExcutedBy;
    }

    public void setTestResultJsonObjectList(List<MainDemoAssignmentTestResultJsonObject> testResultJsonObjectList) {
        this.testResultJsonObjectList = testResultJsonObjectList;
    }

    public void setTestStartTime(String testStartTime) {
        this.testStartTime = testStartTime;
    }

    public void setTestEndTime(String testEndTime) {
        this.testEndTime = testEndTime;
    }

    public void setTestExcutedBy(String testExcutedBy) {
        this.testExcutedBy = testExcutedBy;
    }

    @Override
    public String toString() {
        return "AssignmentJasonTestResult{" +
                "testStartTime='" + testStartTime + '\'' +
                ", testEndTime='" + testEndTime + '\'' +
                ", testExcutedBy='" + testExcutedBy + '\'' +
                ", testResultJsonObjectList=" + testResultJsonObjectList +
                '}';
    }
}
