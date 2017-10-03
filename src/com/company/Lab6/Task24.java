package com.company.Lab6;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt(), a = 30, b = 40, c = 0;
        while (a <= b) {
            if (a == X) {
                System.out.println(a + "+");
            } else {
                System.out.println(a + "-");
            }
            a++;
        }
    }
}