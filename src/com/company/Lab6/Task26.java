package com.company.Lab6;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=100,b=1000,D=13;
        while (a<b) {
            System.out.println(a);
            a=a+1;
            if (a%D==0) {
                System.out.println(a);
            }
        }
    }
}
