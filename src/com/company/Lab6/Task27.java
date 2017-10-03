package com.company.Lab6;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B, summ = 0;
        A = s.nextInt();
        B = s.nextInt();
        if (A < B) {
            while (A < B) {
                A++;
                if (A % 7 == 0) {
                    summ = summ + A;
                    A++;
                }
            }
            System.out.println(summ);
            return;
        }
        if (A > B) {
            while (B < A) {
                B++;
                if (B % 7 == 0) {
                    summ = summ + B;
                    B++;
                }
            }
            System.out.println(summ);
            return;
        }
    }
}