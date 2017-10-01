package com.company.Lab5;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, r;
        A = s.nextInt();
        r = A % 10;
        if (A >= -10 && A <= 100) {
            if (A >= 20 && A <= 100) {
                if (r == 3) {
                    System.out.printf("%d'ий", A);
                    return;
                }
                if (r == 2 || (r >= 6 && r <= 8) || A == 40) {
                    System.out.printf("%d'ой", A);
                    return;
                } else {
                    System.out.printf("%d'ый", A);
                }
            } else {
                if (A == 3) {
                    System.out.printf("%d'ий", A);
                    return;
                }
                if (A == 2 || (A >= 6 && A <= 8)) {
                    System.out.printf("%d'ой", A);
                    return;
                } else {
                    System.out.printf("%d'ый", A);
                }
            }
        } else {
            System.out.println("Значение A должно быть в интервале [-10, 100]");
        }
    }
}
