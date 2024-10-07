package com.javalearning;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numberInput = scanner.nextInt();
  if((numberInput % 5==0) && (numberInput % 3==0)){
            System.out.println("fizzbuzz");
            return;
        }
        if(numberInput % 5==0){
            System.out.println("fizz");
            return;
        }



         if(numberInput % 3==0){
            System.out.println("buzz");
            return;
        }
        System.out.println(numberInput);
    }
}