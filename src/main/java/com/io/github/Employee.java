/*
 * Author Name: Revathi
 * Date: 11-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

import java.util.Objects;

public abstract class Employee {
    private String employeeName;
    private String employeeCode;
    private String dateOfBirth;
    private int age;
    private double salary;

    public Employee(int age) {
        this.age = age;
    }

    public Employee(String employeeName, String employeeCode, String dateOfBirth, int age, double salary) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeName='" + employeeName + '\'' + ", employeeCode='" + employeeCode + '\'' + ", dateOfBirth='" + dateOfBirth + '\'' + ", age='" + age + '\'' + ", salary='" + salary + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeName, employee.employeeName) && Objects.equals(employeeCode, employee.employeeCode) && Objects.equals(dateOfBirth, employee.dateOfBirth) && Objects.equals(age, employee.age) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeeCode, dateOfBirth, age, salary);
    }

    public abstract double calculateIncrement(float hikePercentage);
}
