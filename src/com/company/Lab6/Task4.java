package com.company.Lab6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B;
        A = s.nextInt();
        B = s.nextInt();
        if (A < B) {
            while (B >= A) {
                System.out.print(B + " ");
                B = B - 1;
            }
        }
        else {
            System.out.println("Значение A должно быть не больше значения B");
        }
    }
}
