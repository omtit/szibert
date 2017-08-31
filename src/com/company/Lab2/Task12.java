package com.company.Lab2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double yInGrad;
        yInGrad=s.nextDouble();
        double yInRad;
        yInRad=yInGrad*Math.PI/180;
        double result;
        result=5*Math.cos(yInRad);
        System.out.printf("%.4f",result);
    }
}
