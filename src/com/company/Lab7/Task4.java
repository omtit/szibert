package com.company.Lab7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="abcdacadbacdaabaadc";
        String a=s.nextLine();
        if (a.length()>2 || a.length()<2) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
        }
        int i=str.indexOf(a,0);
        System.out.println(i);
        int x=str.indexOf(a,i+1);
        System.out.println(x);
        int y=str.indexOf(a,x+1);
        System.out.println(y);

    }
}
