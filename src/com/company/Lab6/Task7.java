package com.company.Lab6;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B;
        A = s.nextInt();
        B = s.nextInt();
        if (A < B) {
            while (A <= B) {
                System.out.print(A + " ");
                A = A + 1;
            }
        } else {
            while (B <= A) {
                System.out.print(A + " ");
                A = A - 1;
            }
        }
    }
}
