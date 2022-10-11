/*
 * Author Name: Revathi
 * Date: 11-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

public class Employee {
    private String employeeName;
    private String employeeCode;
    private String dateOfBirth;
    private String age;
    private String salary;

    public Employee(String age) {
        this.age = age;
    }

    public Employee(String employeeName, String employeeCode, String dateOfBirth, String age, String salary) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
