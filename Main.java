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

        System.out.print("Enter the Principal Amount : ");
        float principal = scanner.nextFloat();
        System.out.println("principal : " + principal);
        //
        System.out.print("Enter the Annual Interest Rate : ");
        float annualInterestRate = scanner.nextFloat();

        float monthlyInterestRate = annualInterestRate/12*100;
        //
        System.out.print("Enter the Period of time in Years : ");
        int years = scanner.nextInt();
        //
        //now calculating the mortgage value
        // M = p*r*Math.pow((1+r), n)/Math.pow((1+r), n) -1

        double Mortgage = principal*monthlyInterestRate*Math.pow((1+monthlyInterestRate), years)
                /Math.pow((1+monthlyInterestRate), years) -1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage value : " + mortgageFormatted);




    }
}
