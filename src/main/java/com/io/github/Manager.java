/*
 * Author Name: Revathi
 * Date: 11-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

public class Manager extends Employee {
    private int teamSize;
    private int teamRatings;

    public Manager(String employeeName, String employeeCode,
                   String dob, int age, double salary,
                   int teamSize, int teamRatings) {
        super(employeeName, employeeCode, dob, age, salary);
        this.teamSize = teamSize;
        this.teamRatings = teamRatings;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamRatings() {
        return teamRatings;
    }

    public void setTeamRatings(int teamRatings) {
        this.teamRatings = teamRatings;
    }

    @Override
    public double calculateIncrement(float hikePercentage) {
        if (teamRatings >= 7) {
            super.setSalary(super.getSalary() * hikePercentage);
        }
        return super.getSalary();

    }
}
