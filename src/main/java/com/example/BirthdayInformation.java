package com.example;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayInformation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth date: (MM/dd/yyyy)");
        String input = scanner.nextLine();

        LocalDate birthdate = LocalDate.parse(input, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        DayOfWeek dayOfWeek = birthdate.getDayOfWeek();

        System.out.println("You were born on: " + dayOfWeek.toString().toUpperCase());



    }
}
