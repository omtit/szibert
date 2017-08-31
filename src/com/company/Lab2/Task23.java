package com.company.Lab2;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a,b,c,discriminant;
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        discriminant=b*b-4*a*c;
        System.out.printf("%.4f",discriminant);

    }
}
