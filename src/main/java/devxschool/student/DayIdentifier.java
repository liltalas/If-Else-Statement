package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class DayIdentifier {

    public static void main(String[] args) {
        /**
         *
         * Write a Java program that keeps a number from the user between 1 and 7 and displays the name of the weekday.
         *
         * example output:
         * Enter a number to get day of the week
         * 1
         * You selected Monday!
         *
         * another output:
         * Enter a number to get day of the week
         * 8
         * You selected Wrong day!
         *
         */

        Scanner scanner = new Scanner(System.in);
        String day = ""; // declaring and initializing

        //TODO implement your code here...
        System.out.print("Enter a number to get day of the week: ");
        int numOfDay = scanner.nextInt();

       if(numOfDay == 1){
            day = "Monday";
        } else if(numOfDay == 2){
            day = "Tuesday";
        } else if(numOfDay == 3){
            day = "Wednesday";
        } else if(numOfDay == 4){
            day = "Thursday";
        } else if(numOfDay == 5){
            day = "Friday";
        } else if(numOfDay == 6){
            day = "Saturday";
        } else if(numOfDay == 7){
            day = "Sunday";
        } else {
            day = "Wrong Day";
        }

        System.out.println("You selected " + day + "!");


        Validation.testDayIdentifier(numOfDay, day);
    }
}
