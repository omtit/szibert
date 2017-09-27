package com.company.Lab8;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int S = s.nextInt();
        String A;
        int p = 0;
        int a = arr.length - 1;
        A = arr[a];
        while (p <= S) {
            p++;
            while (a > 0) {
                arr[a] = arr[a - 1];
                a--;
            }
        }
        arr[0] = A;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
