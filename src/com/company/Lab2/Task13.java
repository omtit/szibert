package com.company.Lab2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double x;
        x=s.nextDouble();
        double result;
        result=3*Math.sqrt(61-x);
        System.out.printf("%.4f",result);
    }
}
