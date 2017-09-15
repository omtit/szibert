package com.company.Lab7;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcdefwxyz";
        int CA, CB;
        CA = s.nextInt();
        CB = s.nextInt();
        int l = str.length();
        if (CA < 0) {
            System.out.println("Значение CA должно быть в интервале [0, длина строки)");
            return;
        }
        if (CA + CB > l) {
            System.out.println("Сумма значений CA и CB должна быть меньше длины строки");
            return;
        }
        if (CB < 0) {
            System.out.println("Значение CB должно быть неотрицательно");
        } else {
            String a = str.substring(0, CA);
            String b = str.substring(CA + CB, l);
            System.out.println(a + b);
        }
    }
}
