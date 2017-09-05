package com.company.Lab6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a,b,r;
        a=20;
        b=40;
        r=1;
        while (a<=b) {
            System.out.println(a);
            r=r+Math.pow(a,3);
            a=a+1;
            System.out.print(r+" ");
        }
    }
}
