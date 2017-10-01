package com.company.Lab2;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, h, r;
        h = s.nextDouble();
        r = 6350;
        if (h >= 0) {
            a = Math.sqrt(h * (2 * r + h));
            System.out.printf("%.4f", a);
        } else {
            System.out.println("Высота над уровнем Земли должна быть неотрицательна");
        }
    }
}
