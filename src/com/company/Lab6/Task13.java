package com.company.Lab6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B, sum;
        A = s.nextInt();
        B = s.nextInt();
        sum = 0;
        if (A < B) {
            while (A <= B) {
                sum = sum + A;
                A = A + 1;
            } System.out.print(sum);
        } else {
            while (B <= A) {
                sum = sum + B;
                B = B + 1;
            } System.out.print(sum);
        }
    }
}