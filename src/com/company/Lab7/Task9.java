package com.company.Lab7;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        if (str.contains("s")) {
            System.out.println(str.toLowerCase());
            return;
        }
        if (str.contains("U")) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str);
        }
    }
}
