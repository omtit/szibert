package com.company.Lab5;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A1, B1, A2, B2;
        A1 = s.nextInt();
        B1 = s.nextInt();
        A2 = s.nextInt();
        B2 = s.nextInt();
        if (A1 < B1 && A2 < B2) {
            if (A1 < A2 && A1 < B2 && A2 < B1 && B1 < B2) {
                System.out.printf("пересекаются (%d;%d)", A2, B1);
                return;
            }
            if (A1 < A2 && A1 < B2 && A2 < B1 && B2 < B1) {
                System.out.printf("пересекаются (%d;%d)", A2, B2);
                return;
            }
            if (A2 < A1 && A2 < B1 && A1 < B2 && B2 < B1) {
                System.out.printf("пересекаются (%d;%d)", A1, B2);
                return;
            }
            if (A2 < A1 && A2 < B1 && A1 < B2 && B1 < B2) {
                System.out.printf("пересекаются (%d;%d)", A1, B1);
                return;
            } else {
                System.out.printf("не пересекаются");
            }
        } else {
            System.out.printf("Значение A должно быть меньше значения B");
        }
    }
}
