package com.company.Lab2;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double aInGrad, bInGrad, aInRad, bInRad, result;
        aInGrad = s.nextDouble();
        bInGrad = s.nextDouble();
        aInRad=aInGrad*Math.PI/180;
        bInRad=bInGrad*Math.PI/180;
        result=3*Math.sin(2*aInRad)*Math.cos(3*bInRad);
        System.out.printf("%.4f",result);
    }
}
