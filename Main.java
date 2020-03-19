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
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;
        float principal, annualInterestRate;
        int years;

        while (true){
            System.out.print("Enter the Principal Amount : ");
            principal = scanner.nextFloat();
            if(principal >=1_000 && principal<= 1_000_000)
                break;
            System.out.println("Enter the principal amount between 1000 and 10,00,000");
        }
        //
        while(true){
            System.out.print("Enter the Annual Interest Rate : ");
            annualInterestRate = scanner.nextFloat();
            if(annualInterestRate >=1  && annualInterestRate <=30)
                break;
            System.out.println("Annual Interest rate must be between 1 and 30");

        }
        float monthlyInterestRate = annualInterestRate/100/12;
        //
        while(true){
            System.out.print("Enter the Period of time in Years : ");
            years = scanner.nextInt();
            if(years >=10 && years<= 30)
                break;
            System.out.println("years must be between 10 and 30");
        }
        //
        //now calculating the mortgage value
        // M = p*r*Math.pow((1+r), n)/Math.pow((1+r), n) -1

        double Mortgage = principal*monthlyInterestRate*Math.pow((1+monthlyInterestRate), years)/(Math.pow((1+monthlyInterestRate), years)) -1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage value : " + mortgageFormatted);




    }
}
