package com.company;

public class Calculate {
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
