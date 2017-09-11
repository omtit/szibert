package com.company.Lab5;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, b, c, d;
        A = s.nextInt();
        b = A / 100;
        d = b % 10;
        c = A % 10;
        if (A < 1000) {
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
            return;
        }
        if (A > 9999) {
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
            return;
        }
        if (d == c) {
            System.out.println("равно");
            return;
        } else {
            System.out.println("не равно");
        }
    }
}
