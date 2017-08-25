package com.company.Lab5;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        if (x==y||y==z||x==z) {
            System.out.println("Среди чисел есть равные");
        }
        else {
            System.out.println("Числа не равны друг другу");
        }
    }
}
