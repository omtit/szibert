package com.company.Lab6;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Y = s.nextInt(), a = 0, count = 0;
        if (Y < 0) {
            System.out.println("Значение Y должно быть положительным");
        } else {
            while (a < Y) {
                a++;
                if (Y % a == 0) {
                    count = count + 1;
                    a++;
                }
            }
            if (count == 2) {
                System.out.println("число простое");
                return;
            }
            if (count > 2) {
                System.out.println("число не простое");
            }
        }
    }
}
