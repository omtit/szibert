package com.company.Lab2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double x;
        x=s.nextDouble();
        double y;
        y=s.nextDouble();
        double result;
        result=-5*Math.sqrt(x+Math.sqrt(y));
        System.out.printf("%.4f",result);
    }
}
