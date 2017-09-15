package com.company.Lab8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String[] arr1 = str1.split(" ");
        int[] arr2;
        arr2 = new int[arr1.length];
        int M = s.nextInt();
        int c;
        for (int i = 0; i < arr2.length; i++) {
            c = Integer.parseInt(arr1[i]) * M;
            arr2[i] = c;
        }
        for (int a = 0; a < arr2.length/2; a++) {
            System.out.print(arr2[a]+" ");
        }
    }
}
