package com.company.Lab5;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,z;
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        if (x>y && x>z) {
            System.out.printf("%d",x);
            return;
        }
        if (y>x && y>z) {
            System.out.printf("%d",y);
            return;
        }
        if (z>x && z>y) {
            System.out.printf("%d",z);
        }
    }
}
