package com.company.Lab8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
        }
        System.out.println(sum/arr.length);
    }
}