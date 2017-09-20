package com.company.Lab7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcdacadbacdaabaadc";
        String a = s.nextLine();
        if (a.length() > 2 || a.length() < 2) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
        }
        int f = 0;
        int i;
        i = str.indexOf(a, f);
        while (i >= 0) {
            System.out.println(i);
            f = i + 1;
            i=str.indexOf(a,f);
        }
    }
}

