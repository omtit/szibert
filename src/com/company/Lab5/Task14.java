package com.company.Lab5;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double X, Y, Z;
        X = s.nextDouble();
        Y = s.nextDouble();
        Z = s.nextDouble();
        if ((X > -3 && X < 5) && (Y > -3 && Y < 5) && (Z > -3 && Z < 5)) {
            System.out.printf("%.2f %.2f %.2f", X, Y, Z);
            return;
        }
        if ((X < -3 || X > 5) && (Y > -3 && Y < 5) && (Z > -3 && Z < 5)) {
            System.out.printf("%.2f %.2f", Y, Z);
            return;
        }
        if ((X > -3 && X < 5) && (Y < -3 || Y > 5) && (Z > -3 && Z < 5)) {
            System.out.printf("%.2f %.2f", X, Z);
            return;
        }
        if ((X > -3 && X < 5) && (Y > -3 && Y < 5) && (Z < -3 || Z > 5)) {
            System.out.printf("%.2f %.2f", X, Y);
            return;
        }
        if ((X < -3 || X > 5) && (Y < -3 || Y > 5) && (Z > -3 && Z < 5)) {
            System.out.printf("%.2f", Z);
            return;
        }
        if ((X > -3 && X < 5) && (Y < -3 || Y > 5) && (Z < -3 || Z > 5)) {
            System.out.printf("%.2f", X);
            return;
        }
        if ((X < -3 || X > 5) && (Y > -3 && Y < 5) && (Z < -3 || Z > 5)) {
            System.out.printf("%.2f", Y);
            return;
        }
        if ((X < -3 || X > 5) && (Y < -3 || Y > 5) && (Z < -3 || Z > 5)) {
            System.out.println(" ");
        }
    }
}
