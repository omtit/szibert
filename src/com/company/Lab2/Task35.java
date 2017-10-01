package com.company.Lab2;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1, x2, r;
        x1 = s.nextDouble();
        x2 = s.nextDouble();
        r = Math.sqrt(Math.pow(x2, 2) + Math.pow(x1, 2));
        System.out.printf("%.4f", r);
    }
}
