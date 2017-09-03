package com.company.Lab5;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double A, b, c;
        A = s.nextDouble();
        b = A % 1000;
        c = A % 10;
        if (A < 1000) {
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
            return;
        }
        if (A > 9999) {
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
            return;
        }
        if (b == c) {
            System.out.println("равно");
            return;
        }
        if (b < c || b > c) {
            System.out.println("не равно");
        }
    }
}
