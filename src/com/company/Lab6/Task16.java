package com.company.Lab6;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        double a = 2;
        double summ = 0;
        if (n <= 0) {
            System.out.println("Значение N должно быть положительным");
        } else {
            while (a <= n) {
                summ = summ + 1 / a;
                a++;
            }
            System.out.printf("%.4f", summ + 1);
        }
    }
}
