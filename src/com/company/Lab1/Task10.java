package com.company.Lab1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Integer x,y;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        System.out.printf("INSERT INTO points (x, y) VALUES ('%d', '%d');",x,y);


    }
}
