package com.company.Lab6;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1, s2;
        s1 = "#";
        s2 = ".";
        int Y = s.nextInt(), a = 0, b = 15;
        if (a > Y || Y > b) {
            System.out.println("Значение Y должно быть в интервале [0, 15]");
        } else {
            while (a < Y) {
                System.out.print(s1);
                a++;
                if (a == Y) {
                    while (Y < b) {
                        System.out.print(s2);
                        Y++;
                        a++;
                    }
                }
            }
        }
    }
}