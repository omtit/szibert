package com.company.Lab5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double vKm,vMs;
        Scanner s=new Scanner(System.in);
        vKm=s.nextDouble();
        vMs=s.nextDouble();
        if (vKm<0){
            System.out.println("Значение velocityInKmH должно быть неотрицательным");
            return;
        }
            if (vMs<0)
        {
            System.out.println("Значение velocityInMS должно быть неотрицательным");
            return;
        }
        if (vKm<vMs*3.6){
            System.out.printf("%.2f меньше %.2f",vKm,vMs);}
        else {
            System.out.printf("%.2f меньше %.2f",vMs,vKm);
        }
    }
}
