package com.company.Lab2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double mass;
        double velocity;
        double height;
        double g=9.8067;
        mass=s.nextDouble();
        velocity=s.nextDouble();
        height=s.nextDouble();
        double kineticEnergy;
        double potentialEnergy;
        kineticEnergy=(mass*velocity*velocity)/2;
        potentialEnergy=mass*g*height;
        System.out.printf("Кинетическая энергия составляет: %.4f\nПотенциальная энергия составляет: %.4f",kineticEnergy,potentialEnergy);


    }
}
