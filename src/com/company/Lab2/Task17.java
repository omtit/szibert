package com.company.Lab2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double velocity1;
        velocity1=s.nextDouble();
        double velocity2;
        velocity2=s.nextDouble();
        double distance;
        distance=s.nextDouble();
        double time;
        time=distance/(velocity1+velocity2);
        System.out.printf("%.4f",time);
    }
}
