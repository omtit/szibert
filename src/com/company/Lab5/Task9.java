package com.company.Lab5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Sc, Ss, d, e;
        Sc = s.nextDouble();
        Ss = s.nextDouble();
        d = (Math.sqrt(Sc / Math.PI)) * 2;
        e = Math.sqrt(Ss);
        if (Sc < 0) {
            System.out.println("Площадь круга должна быть положительной");
            return;
        }
        if (Ss < 0) {
            System.out.println("Площадь квадрата должна быть положительной");
            return;
        }
        if (d <= e) {
            System.out.println("Круг уместится в квадрате");
            return;
        } else {
            System.out.println("Круг не поместится в квадрате");
        }

    }
}

