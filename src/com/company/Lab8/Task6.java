package com.company.Lab8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int B, E;
        B = s.nextInt();
        E = s.nextInt();
        if (B <= E) {
            int[] arr2;
            arr2 = new int[E];
            for (int a=0; a<arr2.length; a++) {
                System.out.println(arr2[E]);
            }
        } else {
            int[] arr2;
            arr2 = new int[B];
            while (E <= B) {
                System.out.print(E + " ");
                E = E + 1;
            }
        }
    }
}
