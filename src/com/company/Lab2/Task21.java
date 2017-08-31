package com.company.Lab2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double R1;
        double R2;
        double result;
        R1=s.nextDouble();
        R2=s.nextDouble();
        result=1/R1+1/R2;
        System.out.printf("%.4f",result);
    }
}
