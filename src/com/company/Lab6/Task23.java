package com.company.Lab6;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String simbol;
        int N = s.nextInt(), count = 0, a = 0;
        simbol = "#";
        if (N < 0) {
            System.out.println("Значение N должно быть неотрицательным");
        } else {
            while (count < N) {
                System.out.print(simbol);
                count = count + 1;
                a++;
                if (a == 20) {
                    System.out.print("\n");
                    a=0;
                }
            }
        }
    }
}
