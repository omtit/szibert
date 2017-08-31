package com.company.Lab5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double x,y,z,A,B,C;
        x=s.nextDouble();
        y=s.nextDouble();
        z=s.nextDouble();
        A=Math.pow(x,2);
        B=Math.pow(y,2);
        C=Math.pow(z,2);
        if (x>0 && y>0 && z>0){
            System.out.printf("%.4f;%.4f;%.4f", A, B, C);
            return;
        }
        if (x<0 && y<0 && z<0) {
            System.out.printf("%.4f;%.4f;%.4f", x, y, z);
            return;
        }
        if (x<0 && y>0 && z>0) {
            System.out.printf("%.4f;%.4f;%.4f", x, B, C);
            return;
        }
        if (x>0 && y<0 && z>0) {
            System.out.printf("%.4f;%.4f;%.4f", A, y, C);
            return;
        }
        if (x>0 && y>0 && z<0) {
            System.out.printf("%.4f;%.4f;%.4f", A, B, z);
            return;
        }
        if (x>0 && y<0 && z<0) {
            System.out.printf("%.4f;%.4f;%.4f", A, y, z);
            return;
        }
        if (x<0 && y<0 && z>0) {
            System.out.printf("%.4f;%.4f;%.4f", x, y, C);
            return;
        }
        if (x<0 && y>0 && z<0) {
            System.out.printf("%.4f;%.4f;%.4f",x,B,z);
        }
        }
    }

