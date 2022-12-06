package com.unitedcoder.oopsconcept.inheritancetutorial;

public class GraduateStudent extends Student{
    private String advisorName;
    private String researchProject;

    public GraduateStudent() {
    }

    public GraduateStudent(String advisorName, String researchProject) {
        this.advisorName = advisorName;
        this.researchProject = researchProject;
    }

    public GraduateStudent(long studentID, String firstName, String lastNmae, String className, int age,
                           String major, String birthday, String advisorName, String researchProject) {
        super(studentID, firstName, lastNmae, className, age, major, birthday);
        this.advisorName = advisorName;
        this.researchProject = researchProject;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public String getResearchProject() {
        return researchProject;
    }

    @Override
    public String toString() {
        return super.toString()+", "+advisorName+", "+researchProject+", ";
    }
}
