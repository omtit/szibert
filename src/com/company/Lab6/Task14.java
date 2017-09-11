package com.company.Lab6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long A, B, r;
        A = s.nextInt();
        B = s.nextInt();
        r = 1;
        if (A < B) {
            while (A <= B) {
                r = r * A;
                A = A + 1;
            } System.out.print(r);
        } else {
            while (B <= A) {
                r = r * B;
                B = B + 1;
            } System.out.print(r);
        }
    }
}
