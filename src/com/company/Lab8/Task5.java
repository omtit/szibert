package com.company.Lab8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        int[] arr3;
        arr3 = new int[arr1.length];
        int c;
        for (int i = 0; i < arr3.length; i++) {
            c = Integer.parseInt(arr1[i]) * Integer.parseInt(arr2[i]);
            arr3[i] = c;
        }
        for (int a = 0; a < arr3.length; a++) {
            System.out.print(arr3[a]+" ");
        }
    }
}
