package com.company.Lab2;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double v1, t1, v2, t2, v, t, r;
        v1 = s.nextDouble();
        t1 = s.nextDouble();
        v2 = s.nextDouble();
        t2 = s.nextDouble();
        if (v1 >= 0 && v2 >= 0) {
            v = v1 + v2;
            t = (t1 * v1 + t2 * v2) / (v1 + v2);
            System.out.printf("volume = %.0f \n temperatur = %.4f", v, t);
        } else {
            System.out.printf("Объем должен быть неотрицательным");
        }
    }
}
