package com.company.Lab6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A,B;
        A=s.nextInt();
        B=s.nextInt();
        while (B>=A) {
            System.out.println(A);
            A=A+1;
        }


    }
}
