package com.company.Lab6;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, x, B, y, sum;
        A = s.nextInt();
        x = -100;
        y = 500;
        sum = 0;
        if (A < x || A > y) {
            System.out.println("Значение A должно быть в интервале [-100, 500]");
        } else {
            while (x <= A && A <= y) {
                System.out.println(A);
                sum = sum + A;
                A = A + 1;
                System.out.print(sum + " ");
            }
        }
    }
}
