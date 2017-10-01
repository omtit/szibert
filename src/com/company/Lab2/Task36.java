package com.company.Lab2;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Xa, Ya, Xb, Yb, AB;
        Xa = s.nextDouble();
        Ya = s.nextDouble();
        Xb = s.nextDouble();
        Yb = s.nextDouble();
        AB = Math.sqrt((Math.pow((Xb - Xa), 2)) + (Math.pow((Yb - Ya), 2)));
        System.out.printf("%.4f", AB);
    }
}
