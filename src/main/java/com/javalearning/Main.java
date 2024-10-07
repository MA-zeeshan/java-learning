package com.javalearning;

import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
//        mortgage calculator
        System.out.println("///*** This is an example mortgage calculator ***///");
        System.out.print("Principal Amount (The actual Amount you want to get): ");
        Scanner scanner = new Scanner(System.in);
        int actualAmount = scanner.nextInt();


        System.out.print("Annual Interset Rate: ");
        float interestRate = scanner.nextFloat();
        float monthlyInterestRate = interestRate/PERCENT/MONTHS_IN_YEAR;


        System.out.print("Number of Years: ");
        byte loanForYears = scanner.nextByte();
        int numberOfPayments = loanForYears * MONTHS_IN_YEAR;
        double mortgage = actualAmount * (monthlyInterestRate * Math.pow(1+monthlyInterestRate, numberOfPayments))
                                        / (Math.pow(1+monthlyInterestRate, numberOfPayments-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println(mortgageFormatted);





    }
}