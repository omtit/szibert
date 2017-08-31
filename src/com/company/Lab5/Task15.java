package com.company.Lab5;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A,B,C;
        A=s.nextInt();
        B=s.nextInt();
        C=s.nextInt();
        if (A<0) {
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }
        if (B<0) {
            System.out.println("Значение B должно быть неотрицательным");
            return;
        }
        if (C<0) {
            System.out.println("Значение C должно быть неотрицательным");
            return;
        }
        if (A==B || B==C || A==C) {
            System.out.println("Треугольник является равнобедренным");
        }
        else {
            System.out.println("Треугольник не является равнобедренным.");
        }
    }
}
