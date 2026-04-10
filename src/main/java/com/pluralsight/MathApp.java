package com.pluralsight;

import org.w3c.dom.ls.LSInput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();
        input.nextLine();
        double calculatorResult = num1 * num2;


        System.out.println("Possible calculations: ");
        System.out.println("Enter:\n (A)dd\n (S)ubtract\n (M)ultiply\n (D)ivide ");
        System.out.println("Processing....... ");
        System.out.println("Multiplication chosen");
        System.out.println("The result is " + calculatorResult);









    }
}
