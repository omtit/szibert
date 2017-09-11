package com.company.Lab8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int a = 0;
        a = arr.length - 1;
        while (a>=0) {
            System.out.print(arr[a] + " ");
            a = a - 1;
        }
    }
}