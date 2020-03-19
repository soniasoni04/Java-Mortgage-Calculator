package com.company;

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
        float p = scanner.nextFloat();
        System.out.println("p : " + p);
        //
        System.out.print("Enter the Annual Rate : ");
        float r = scanner.nextFloat();
        //
        System.out.print("Enter the Period of time in Years : ");
        int n = scanner.nextInt();



    }
}
