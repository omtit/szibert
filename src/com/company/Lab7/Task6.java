package com.company.Lab7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcdefwxyz";
        String CA, CB;
        CA = s.nextLine();
        if (str.contains(CA)) {
            CB = s.nextLine();
            if (str.contains(CA)) {
                int a = str.indexOf(CA);
                int la = str.length();
                int b = str.indexOf(CB);
                if (a < b) {
                    String T = str.substring(a + 1, b);
                    System.out.println(T);
                }
                if (b < a) {
                    String T = str.substring(b + 1, a);
                    System.out.println(T);
                }
            } else {
                System.out.println("Значение CB отсутствует в строке");
            }
        } else {
            System.out.println("Значение CA отсутствует в строке");
        }
    }
}