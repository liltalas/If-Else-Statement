package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String DIVIDE = "/";
    private static final String MULTIPLY = "*";

    public static void main(String[] args) {

        /**
         *
         * Write a calculator program
         * if there is an invalid operator return result as -1
         *
         * Example output:
         *  Enter your first number:
         *  1
         *   Enter your operator:
         *  /
         *  Enter your second number:
         *  0
         *  Your result is Infinity
         */

        Scanner scanner;
        double number1 = 0;
        double number2 = 0;
        String operator = "";
        double result = 0;

        //TODO implement your code here...


        //ignore this...
        Validation.testCalculator(number1, operator, number2, result);
    }
}
