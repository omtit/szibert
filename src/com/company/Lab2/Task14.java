package com.company.Lab2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a;
        a=s.nextDouble();
        double b;
        b=s.nextDouble();
        double result;
        result=a*Math.sqrt(-7*b);
        System.out.printf("%.4f",result);
    }
}
