
package com.unitedcoder.lambdaandstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithObject {
    public static void main(String[] args) {
        List<Employee> employees = getEmployee();
        //filter
        List<Employee> females = employees.stream().filter(employee -> employee.getGender().equals(Gender.FEMALE)).
                collect(Collectors.toList());
         //females.forEach(System.out::println);
        //Sort
        List<Employee> sort = employees.stream().sorted(Comparator.comparing(Employee::getSalary).
                reversed()).collect(Collectors.toList());
        sort.forEach(System.out::println);
        //All match
        boolean allMatch = employees.stream().allMatch(employee -> employee.getAge() > 30);
        System.out.println(allMatch);
        //AnyMatch
        boolean anyMatch=employees.stream().anyMatch(employee -> employee.getAge()>30);
        System.out.println(anyMatch);
        //none match
        boolean noneMatch=employees.stream().noneMatch(employee -> employee.getName().equals("Ale"));
        System.out.println(noneMatch);
        //Max
        employees.stream().max(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);
        //Min
        employees.stream().min(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
    }

    private static List<Employee> getEmployee() {
        return Arrays.asList(
                new Employee("Anna", 25, Gender.FEMALE, 1500),
                new Employee("Halen", 35, Gender.FEMALE, 2000),
                new Employee("Tom", 30, Gender.MALE, 1200),
                new Employee("Alex", 45, Gender.MALE, 3000));

    }
}