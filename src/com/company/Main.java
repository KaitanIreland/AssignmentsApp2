package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) {
        //Output the current date-time
        LocalDateTime today = LocalDateTime.now();
        System.out.println("The date and time right now is " + today + ".");
        //Output tomorrow's date using a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formatDateTime = today.format(formatter);
        System.out.println(formatDateTime);
        //Add 5 weeks to today's LocalDateTime.
        LocalDateTime fiveWeeks = today.plusWeeks(5);
        System.out.println(fiveWeeks);
        //Initialize a LocalDateTime object to your birthdate and the time 12:35 PM.
        LocalDateTime kaitansBirthday = LocalDateTime.of(1998, 10 , 14,  12,  35 );
        //Output the day of the week (Sunday-Saturday that you were born
        DayOfWeek dayofWeek = kaitansBirthday.getDayOfWeek();
        System.out.println("Kaitan was born on a " + dayofWeek + ".");
        //Output the number of days you've been alive.
        long daysFromBirthday = kaitansBirthday.toEpochSecond(ZoneOffset.MAX);
        long daysFromToday;
        daysFromToday = today.toEpochSecond(ZoneOffset.MAX);
        long resultFromDates = daysFromToday - daysFromBirthday;
        long secondsToDays = resultFromDates / 86400;
        System.out.println("Kaitan has been alive for " + secondsToDays + " days.");
        //Output the number of days between two dates.
        Random rand = new Random();
        LocalDate randomDate1 = LocalDate.of(rand.nextInt(9999), rand.nextInt(12) + 1, rand.nextInt(28) + 1);
        LocalDate randomDate2 = LocalDate.of(rand.nextInt(9999), rand.nextInt(12) + 1, rand.nextInt(28) + 1);
        System.out.println("Date 1: " + randomDate1);
        System.out.println("Date 2: " + randomDate2);
        System.out.println("The number of days between these two dates are: " + Math.abs(randomDate1.compareTo(randomDate2)));
        //Given two dates, output the earlier..
        if (randomDate1.isBefore(randomDate2)) {
            System.out.println("The earlier date is " + randomDate1);
        }
        else
            System.out.println("The earlier date is " + randomDate2);

        //Create a file with 100 random "month/day/year hour:minutes" (in that format) on each line.
        File outfile = new File( "RandomDateFile.txt" );
                    try( PrintWriter pw = new PrintWriter(outfile) ) {
                        for (int i = 0; i < 50; i++) {
                            LocalDateTime randomDatesLoop = today.minusSeconds(rand.nextInt(345678909));
                            LocalDateTime randomDatesLoop2 = today.plusSeconds(rand.nextInt(345678909));
                            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM-dd-yy HH:mm");
                            pw.println(randomDatesLoop.format(formatter2));
                            pw.println(randomDatesLoop2.format(formatter2));
                        }
                           } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }


        //TODO Store data from the file into an ArrayList of LocalDateTime objects.
        //ArrayList<LocalDateTime> dataFromFile = new ArrayList<LocalDateTime>();
    File infile = new File( "RandomDateFile.txt" );

    try( Scanner sc = new Scanner( infile)) {
            while( sc.hasNext() ) {
            }
        }
         catch (FileNotFoundException e) {
        e.printStackTrace();
    }


        //TODO Output the number of stored dates in the year [Y]
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Which year would you like to investigate?");


        //TODO Count the number of stored dates within the current year

        //TODO Count the number of duplicates

        //TODO Sort the dates in chronological order

        //TODO Count the number of stored dates in the current year

        //TODO Count the number of
    }}

