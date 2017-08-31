package com.company.Lab2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double radius;
        radius=s.nextDouble();
        double volume;
        volume=4*Math.PI*(int)Math.pow(radius,3)/3;
        System.out.printf("%.4f",volume);
    }
}
