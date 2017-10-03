package com.company.Lab6;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 100, b = 1000, count=0;
        while (a < b) {
            a++;
            if (a % 13 == 0) {
                count=count+1;
                a++;
            }
        }
        System.out.println(count);
    }
}
