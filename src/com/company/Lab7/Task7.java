package com.company.Lab7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.length() < 13 || str.length() > 13) {
            System.out.println("Некорректная длина штрих-кода");
        } else {
            String a = str.substring(0, 2);
            System.out.println("Код страны:" + a);
            String b = str.substring(3, 6);
            System.out.println("Код изготовителя:" + b);
            String c = str.substring(7, 11);
            System.out.println("Код товара:" + c);
            String d = str.substring(12);
            System.out.println("Контрольное число:" + d);
        }
    }
}