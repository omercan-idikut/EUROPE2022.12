package com.unitedcoder.oopsconcept.inheritancetutorial;

import java.util.List;

public class DoctorStudent extends GraduateStudent{
    private String thesisTopic;
    private List<String> publications;

    public DoctorStudent(){

    }

    public DoctorStudent(String thesisTopic, List<String> publication) {
        this.thesisTopic = thesisTopic;
        this.publications = publication;
    }

    public DoctorStudent(long studentID, String firstName, String lastNmae,
                         String className, int age, String major, String birthday, String advisorName, String researchProject,
                         String thesisTopic, List<String> publication) {
        super(studentID, firstName, lastNmae, className, age, major, birthday, advisorName, researchProject);
        this.thesisTopic = thesisTopic;
        this.publications = publication;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public List<String> getPublications() {
        return publications;
    }

    @Override
    public String toString() {
        return super.toString()+", "+thesisTopic+", "+publications+", ";
    }
}
