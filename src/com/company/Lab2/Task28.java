package com.company.Lab2;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a,b,c,x,R;
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        x=s.nextDouble();
        R=1/(Math.sqrt(a*Math.pow(x,2)+b*x+c));
        System.out.printf("%.4f",R);
    }
}
