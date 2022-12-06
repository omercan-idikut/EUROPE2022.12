package com.unitedcoder.oopsconcept.inheritancetutorial;

import java.util.Arrays;

public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student(101, "Mike", "Smith", "IT", 18,
                "SDET", "2006-12-09");
        System.out.println(student);
        System.out.println("Below are Graduate Students Info:");

        GraduateStudent graduateStudent = new GraduateStudent(201, "David",
                "Smith", "Java", 20, "Developer",
                "2008-10-23", "Dolkun", "E-Commerce Application");
        System.out.println(graduateStudent);
        System.out.println("Blows are Doctor Studens Info:");

        DoctorStudent doctorStudent = new DoctorStudent(8765, "Idikut", "Uyghur",
                "ClassA", 22, "Computer-Science", "2010-09-12", "Tarim",
                "BlockChain Technology", "BlockChain Privacy",
                Arrays.asList("Hacking in BlockChain", "Privacy Enhancement in BlockChain"));
        System.out.println(doctorStudent);
    }
}
