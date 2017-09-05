package com.company.Lab6;

import java.util.Scanner;

public class Task22_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String simbol;
        int N, count = 0, a = 0;
        N = s.nextInt();
        simbol = "!";
        if (N < 0) {
            System.out.println("Значение N должно быть неотрицательным");
        } else {
            while (count < N) {
                System.out.print(simbol);
                count = count + 1;
                a = a + 1;
                if (a%5==0) {
                    System.out.print(" ");
                }
            }
        }
    }
}