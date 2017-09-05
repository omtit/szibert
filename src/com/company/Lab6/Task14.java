package com.company.Lab6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B, r;
        A = s.nextInt();
        B = s.nextInt();
        r = 1;
        if (A < B) {
            while (A <= B) {
                System.out.println(A);
                r = r * A;
                A = A + 1;
                System.out.print(r + " ");
            }
        } else {
            while (B <= A) {
                System.out.print(B);
                r = r * B;
                B = B + 1;
                System.out.println(r + " ");
            }
        }
    }
}
