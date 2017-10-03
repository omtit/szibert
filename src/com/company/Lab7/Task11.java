package com.company.Lab7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.startsWith("\"")) {
            if (str.endsWith("\"")) {
                System.out.println(str.replace("\"", "").replace(" ",""));
            } else {
                System.out.println("Строка должна начинаться и заканчиваться кавычкой");
            }
        } else {
            System.out.println("Строка должна начинаться и заканчиваться кавычкой");
        }
    }
}