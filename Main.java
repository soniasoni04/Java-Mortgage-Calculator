package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("**Welcome to Mortgage calculator**");
        System.out.println("***********************************");
        System.out.println("");

        int principal = (int) Console.readNumber("Enter the Principal Amount : ", 1_000 , 10_000_00);
        float annualInterestRate = (float) Console.readNumber("Enter the Annual Interest Rate : ", 1, 30);
        int years =  (int) Console.readNumber("Enter the number of years : ", 10, 30);

        double result = Calculate.mortgageCalculator(principal, annualInterestRate, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage value : " + mortgageFormatted);
    }

}
