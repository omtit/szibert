package com.company.Lab6;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        int b = 7;
        int c = 1;
        while (a <= b) {
            System.out.println(a + " x " + b + " = " + a * b);
            a = a + 1;
        }
    }
}
