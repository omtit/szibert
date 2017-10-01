package com.company.Lab2;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double y, x = s.nextDouble();
        y = 7 * Math.pow(x, 2) - 3 * x + 6;
        System.out.printf("%.0f", y);
    }
}
