package com.company.Lab2;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double b, a = s.nextDouble();
        b = 12 * Math.pow(a, 2) + 7 * a - 16;
        System.out.printf("%.4f", b);
    }
}
