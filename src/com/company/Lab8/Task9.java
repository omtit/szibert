package com.company.Lab8;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");

        String A;
        int a = arr.length - 1;
        A = arr[a];
        while (a > 0) {
            arr[a] = arr[a - 1];
            a = a - 1;
        }
        arr[0] = A;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
