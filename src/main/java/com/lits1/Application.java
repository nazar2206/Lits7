package com.lits1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a: ");
        double InputA = input.nextDouble();
        System.out.println("Write b: ");
        double InputB = input.nextDouble();
        System.out.println("Write c: ");
        double InputC = input.nextDouble();

        double Discriminant = (InputB * InputB) - (4.0 * InputA * InputC);
        if(Discriminant == 0) {
            double x = (-InputB) / (2.0 * InputA);
            System.out.println("x= " + x);
        } else if(Discriminant < 0) {
            System.out.println("Discriminant lower than 0");
        }else {
            double x1 = ((-InputB) + Math.sqrt(Discriminant)) / (2.0 * InputA);
            double x2 = ((-InputB) - Math.sqrt(Discriminant)) / (2.0 * InputA);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        }
    }
}
