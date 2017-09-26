package com.company.Lab7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcdacadbacdaabaadc";
        String a = s.nextLine();
        if (a.length() > 2 || 2 > a.length()) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
        } else {
            System.out.println(str.replace(a, " "));
        }
    }
}