package com.unitedcoder.classconcepts;

import java.util.*;

public class CompareToDemo{
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(10,100,20,80,40,300);
        List<String> list2=Arrays.asList("Name","Age","Salary","Departmaent");
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);

        List<Employee> employeeList=new ArrayList<>();
        Employee employee1=new Employee("Mike","01","HR",300,30);
        Employee employee2=new Employee("Tom","05","IT",500,20);
        Employee employee3=new Employee("David","06","Global IT",9000,40);
        Employee employee4=new Employee("Lara","03","Devops",2000,35);

        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4));
//        employeeList.sort(Comparator.comparing(Employee::getAge));
//        System.out.println(employeeList);
//        employeeList.sort(Comparator.comparing(Employee::getEmployeeName));
//        System.out.println(employeeList);
//        employeeList.sort(Comparator.comparing(Employee::getSalary));
//        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(employeeList);

    }
}
