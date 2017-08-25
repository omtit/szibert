package com.company.Lab5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double dK,dF;
        Scanner s=new Scanner(System.in);
        dK=s.nextDouble();
        dF=s.nextDouble();
        if (dF<0) {
            System.out.println("Значение distanceInFeet должно быть неотрицательным");
            return;
        }
            if (dK<0){
                System.out.println("Значение distanceInKm должно быть неотрицательным");
                return;
            }

        if (dK*1000<dF*0.305) {
            System.out.println("Расстояние в км меньше");

        }
        else  {
            System.out.println("Расстояние в футах меньше");
        }

    }
}
