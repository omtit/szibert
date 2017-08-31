package com.company.Lab5;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double m,p,t,d;
        m=s.nextInt();
        p=s.nextInt();
        d=m/p;
        t=m%p;
        if (t>0) {
            System.out.println("M не делится нацело на P");
            return;
        }
        if (t==0) {
            System.out.printf("%.0f",d);
        }
        if (p<1 && p>-1) {
            System.out.println("Значение P должно быть не равно нулю");
        }


    }
}
