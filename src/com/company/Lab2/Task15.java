package com.company.Lab2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double temperatureInC;
        temperatureInC=s.nextDouble();
        double temperatureInF;
        temperatureInF=temperatureInC*1.8+32;
        System.out.printf("%.4f",temperatureInF);
    }
}
