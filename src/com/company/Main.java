package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your weight: ");
//        double weight = scanner.nextDouble();
//
//        System.out.print("Enter your height: ");
//        double height = scanner.nextDouble();
//        scanner.close();
//
//        double BMI = weight / (Math.pow(height,2));
//
//        if (BMI < 18.5 || BMI > 24.9) {
//            System.out.println("BMI is not optimal");
//        } else {
//            System.out.println("BMI is optimal");
//        }



        //factorial
        System.out.println(factorial(4));
    }


    // recursion is a situation or process where method or a function
    // call itself
    public static int factorial (int n){
        if (n == 0|| n==1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
