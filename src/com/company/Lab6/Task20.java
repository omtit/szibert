package com.company.Lab6;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double A, B, summ;
        A = s.nextDouble();
        B = s.nextDouble();
        summ = 0;
        if (A < B) {
            while (A <= B) {
                summ = summ + Math.pow(A, 2);
                A++;
            }
            System.out.println(summ);
            return;
        }
        if (A > B) {
            while (A >= B) {
                summ = summ + Math.pow(B, 2);
                B++;
            }
            System.out.println(summ);
        }
    }
}