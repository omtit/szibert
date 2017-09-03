package com.company.Lab6;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 1;
        int b = 20;
        int c = 453;
        while (a <= b) {
            System.out.println(a+" "+c);
            a = a + 1;
            c = c + 453;
        }
    }
}
