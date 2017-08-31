package com.company.Lab5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A,R1,R2;
        A=s.nextInt();
        R1=A*(-1);
        R2=A;
        if (A<0) {
            System.out.printf("%d", R1);
        }
        else {
            System.out.printf("%d",R2);
        }
    }
}
