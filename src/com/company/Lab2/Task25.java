package com.company.Lab2;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double a,b,Rad,Grad,result;
        a=s.nextDouble();
        b=s.nextDouble();
        Grad=s.nextDouble();
        Rad=Grad*Math.PI/180;
        result=Math.sqrt(a*a+b*b-2*a*b*Math.cos(Rad));
        System.out.printf("%.4f",result);
    }
}
