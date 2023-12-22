package com.infy.LocalDatePackage;

import java.time.LocalDate;
import java.time.Period;

public class AgeFinder {
    public int getAge(LocalDate dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        return age.getYears();
    }

    public LocalDate getDateAfterNDays(int noOfDays) {
        return LocalDate.now().plusDays(noOfDays);
    }

    public LocalDate getDateAfterXYearYMonthZDays(int year, int month, int day) {
        return LocalDate.now().plusYears(year).plusMonths(month).plusDays(day);
    }

    public static void main(String[] args) {
        AgeFinder ageFinder = new AgeFinder();

        // Get age based on date of birth
        LocalDate dateOfBirth = LocalDate.of(1990, 5, 18);
        int age = ageFinder.getAge(dateOfBirth);
        System.out.println("Your age is: " + age + " years");

        // Get date after N days
        int noOfDays = 15;
        LocalDate dateAfterNDays = ageFinder.getDateAfterNDays(noOfDays);
        System.out.println("The date after " + noOfDays + " days is: " + dateAfterNDays);

        // Get date after X year, Y month, and Z days
        int year = 1;
        int month = 2;
        int day = 3;
        LocalDate dateAfterXYZDays = ageFinder.getDateAfterXYearYMonthZDays(year, month, day);
        System.out.println("The date after " + year + " year, " + month + " months, and " + day + " days is: " + dateAfterXYZDays);
    }
}
