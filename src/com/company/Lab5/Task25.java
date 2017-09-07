package com.company.Lab5;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double x,y;
        x=s.nextDouble();
        y=s.nextDouble();
        if (x>=1 && y<=-1 && x<=3 && y>=-2) {
            System.out.printf("Точка с координатами (%.1f, %.1f) принадлежит множеству",x,y);
        } else {
            System.out.printf("Точка с координатами (%.1f, %.1f) не принадлежит множеству",x,y);
        }
    }
}
