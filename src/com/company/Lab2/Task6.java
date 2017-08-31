package com.company.Lab2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int base;
        base=s.nextInt();
        int height;
        height=s.nextInt();
        double area;
        area=base*height/2;
        System.out.printf("%.2f",area);
    }
}
