package com.company.Lab2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double aInGrad;
        aInGrad=s.nextDouble();
        double aInRad;
        aInRad=aInGrad*Math.PI/180;
        System.out.printf("%.4f",aInRad);
    }
}
