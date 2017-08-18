package com.company.Lab2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double radius;
        radius=s.nextDouble();
        double circumference;
        circumference=2*Math.PI*radius;
        System.out.printf("%.4f",circumference);
    }
}
