package com.company.Lab6;

import java.util.Scanner;

public class Task6 {
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
        }
        else {
            while (B <= A) {//A 23   B 11
                System.out.print(B + " ");
                B = B + 1;
            }
        }
    }
}
