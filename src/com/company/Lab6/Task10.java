package com.company.Lab6;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 100;
        int b = 500;
        int summa = 0;
        while (b >= a) {
            System.out.println(a);
            summa = summa + a;
            a = a + 1;
            System.out.print(summa + " ");

        }
    }

}

