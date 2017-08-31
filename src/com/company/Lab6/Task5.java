package com.company.Lab6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        int i=0;
        String b;
        b=s.nextLine();
        a=s.nextInt();
        System.out.print("\"");
        System.out.print(b);
        while (i<a) {
            System.out.print(b);
            i = i + 1;
        }
        System.out.print("\"");


        }

    }

