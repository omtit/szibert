package com.company.Lab2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double initialVelocity;
        double time;
        double acceleration;
        double distance;
        initialVelocity=s.nextDouble();
        time=s.nextDouble();
        acceleration=s.nextDouble();
        distance=initialVelocity*time+((acceleration*time*time)/2);
        System.out.printf("%.2f",distance);

    }
}
