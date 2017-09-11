package com.company.Lab2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double totalInM;
        double partInCm;
        double result1;
        double result2;
        totalInM = s.nextDouble();
        partInCm = s.nextDouble();
        if (totalInM < 0 && partInCm < 0) {
            System.out.println("Значение totalInM должно быть положительным");
        } else {
            result1 = (totalInM * 100) / partInCm;
            result2 = (totalInM * 100) % partInCm;
            System.out.printf("%.0f шт %.0f см", result1, result2);
        }

    }
}
