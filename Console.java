package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Console {
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
}
