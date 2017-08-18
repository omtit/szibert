package com.company.Lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int edge;
        edge=s.nextInt();
        int area;
        area=6*(int)Math.pow(edge,2);
        System.out.printf("%d",area);
    }
}
