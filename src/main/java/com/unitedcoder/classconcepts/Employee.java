package com.unitedcoder.classconcepts;

public class Employee implements Comparable<Employee>{
    private String employeeName;
    private String EmployeeId;
    private String Department;
    private long salary;
    private int age;

    public Employee() {
    }

    public Employee(String employeeName, String employeeId, String department, long salary, int age) {
        this.employeeName = employeeName;
        this.EmployeeId = employeeId;
        Department = department;
        this.salary = salary;
        this.age = age;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public String getDepartment() {
        return Department;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + EmployeeId + '\'' +
                ", Department='" + Department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        if (salary==employee.salary){
            return 0;
        }
        else if (salary> employee.salary)
            return 1;
        else
            return -1;
    }
}
