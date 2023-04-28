package com.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        String date1 = today.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        String date2 = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        String date3 = today.format(DateTimeFormatter.ofPattern("MMM d, yyyy"));

        String date4 = today.format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy hh:mm a"));

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);


    }

}
