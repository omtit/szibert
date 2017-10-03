package com.company.Lab6;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt(), a = 0;
        if (X < 0) {
            System.out.println("Значение X должно быть положительным");
        } else {
            while (a < X) {
                a++;
                if (X % a == 0) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
