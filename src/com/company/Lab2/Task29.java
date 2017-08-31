package com.company.Lab2;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double x,R;
        x=s.nextDouble();
        R=(Math.sqrt(x+5)+Math.sqrt(x-5))/(2*Math.sqrt(x));
        System.out.printf("%.6f",R);
    }
}
