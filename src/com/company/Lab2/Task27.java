package com.company.Lab2;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double x,result;
        x=s.nextDouble();
        result=Math.sqrt(1-Math.pow(Math.sin(x),2));
        System.out.printf("%.4f",result);

    }
}
