package com.company.Lab2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double mass,aInGrad,aInRad,result;
        double g=9.8067;
        mass=s.nextDouble();
        aInGrad=s.nextDouble();
        aInRad=aInGrad*Math.PI/180;
        result=mass*g*Math.cos(aInRad);
        System.out.printf("%.6f",result);

    }
}
