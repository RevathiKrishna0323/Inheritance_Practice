/*
 * Author Name: Revathi
 * Date: 11-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

public class EmployeeImpl {
    public static void main(String[] args) {

        Manager manager = new Manager("Jane", "e00123", "03/03/1999", 23, 3000, 4, 8);

        // Display Manager details
        System.out.println("The Employee Name   is : " + manager.getEmployeeName());
        System.out.println("The Employee Code   is : " + manager.getEmployeeCode());
        System.out.println("The Employee DOB    is : " + manager.getDateOfBirth());
        System.out.println("The Employee Age    is : " + manager.getAge());
        System.out.println("The Employee Salary is : " + manager.getSalary());
        System.out.println("The Employee Team Size is    : " + manager.getTeamSize());
        System.out.println("The Employee Team Ratings is : " + manager.getTeamRatings() + " stars");
        System.out.println("The incremented salary : " + manager.calculateIncrement(1.25f));
    }
}
}



