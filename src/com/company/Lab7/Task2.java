package com.company.Lab7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="abcdefwxyz";
        String x=s.nextLine();
        int i=str.indexOf(x);
        int l=str.length();
        System.out.println(l-i-1);
    }
}
