package com.company.Lab2;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a,b,c,d,R;
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        d=s.nextDouble();
        R=(a*d+b*c)/(a*d);
        System.out.printf("%.4f",R);
    }
}
