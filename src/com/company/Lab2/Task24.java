package com.company.Lab2;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double mass1,mass2,distance,force;
        double g=9.8067;
        mass1=s.nextDouble();
        mass2=s.nextDouble();
        distance=s.nextDouble();
        force=g*((mass1*mass2)/(distance*distance));
        System.out.printf("%.4f",force);
    }
}
