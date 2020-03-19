package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("**Welcome to Mortgage calculator**");
        System.out.println("***********************************");
        System.out.println("");
        //
        int principal, years;
        float annualInterestRate =0;

        principal = (int)readNumber("Enter the Principal Amount : ", 1_000 , 10_000_00);
        annualInterestRate = (float)readNumber("Enter the Annual Interest Rate : ", 1, 30);
        years =  (int)readNumber("Enter the number of years : ", 10, 30);

        double result = mortgageCalculator(principal, annualInterestRate, years);
        System.out.println("result : " + result);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage value : " + mortgageFormatted);

    }

    public static double readNumber(String prompt, int min, int max){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double value;
        while(true){
            System.out.println(prompt);
            value = scanner.nextDouble();
            if(value >= min && value<= max)
                break;
            System.out.println("Enter the value between " + min + " and " +  max);
        }
        return value;
    }

    public static double mortgageCalculator(
            int principal,
            float annualInterestRate,
            int years){

        int numberOfPayment = years * 12;
        float monthlyInterestRate = annualInterestRate/100/12;

        double Mortgage = principal
                * monthlyInterestRate*Math.pow((1+monthlyInterestRate), numberOfPayment)
                /(Math.pow((1+monthlyInterestRate), numberOfPayment)) -1;
        return Mortgage;
    }
}
