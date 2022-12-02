package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class NumberIdentifier {
    public static void main(String[] args) {

        /**
         *
         * Write a Java program that reads an integer and check whether it is negative, zero, or positive.
         *
         * example output:
         * Enter a number
         * 0
         * Your number "0" is zero
         */

        Scanner scanner;
        String value = "";

        //TODO implement your code here...

        scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number >= 0){
            if(number == 0){
                value = "zero";
            } else{
                value = "positive";
            }
        }  else{
            value = "negative";
        }

        System.out.println(value);


        /*ignore this...*/
        Validation.testNumber(number, value);

        System.out.println("\n\n#########################################\nTask2\n\n");
        /**
         *
         * Take three numbers from the user and print the greatest number.
         * if numbers are equal then print all equal numbers.
         *
         * example output:
         * Enter first number:
         * 1
         * Enter second number:
         * 1
         * Enter third number:
         * 1
         * The greatest number: 1 & 2 & 3
         *
         *
         *
         * Enter first number:
         * 100
         * Enter second number:
         * 50
         * Enter third number:
         * 200
         * The greatest number: 3
         *
         */


        String greatestNum = "";


        //TODO implement your code here...
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        if(num1 > num2 && num2 > num3){
            greatestNum = "1";
        } else if(num2 > num3 && num1 < num2){
            greatestNum = "2";
        } else if(num3 > num1 && num3 > num2){
            greatestNum = "3";
        } else if(num1 == num2){
            greatestNum = "1 & 2";
        }  else if(num2 == num3){
            greatestNum = "2 & 3";
        }  else if(num1 == num3){
            greatestNum = "1 & 3";
        } else {
            greatestNum = "1 & 2 & 3";
        }


        System.out.println("The greatest number: " + greatestNum);


        //ignore this...
        Validation.testGreatestNumber(num1, num2, num3, greatestNum);

   }
}
