package com.company.Lab2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double xInGrad;
        xInGrad=s.nextDouble();
        double xInRad;
        xInRad=xInGrad*Math.PI/180;
        double result;
        result=Math.sin(xInRad);
        System.out.printf("%.4f",result);

    }
}
