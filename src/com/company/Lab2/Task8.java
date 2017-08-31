package com.company.Lab2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double totalInM;
        totalInM=s.nextDouble();
        double partInCm;
        partInCm=s.nextDouble();
        double result1;
        result1=totalInM/partInCm*100;
        double result2;
        result2=totalInM-result1*partInCm/100;
        System.out.printf("%.0f шт %.0f см",result1,result2);

    }
}
