package com.company.Lab6;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, a = 10, b = 20;
        x = s.nextInt();
        while (a <= b) {
            if (a == x) {
                System.out.println(a + "+");
            } else {
                System.out.println(a);
            }
            a = a + 1;
        }

    }
}
