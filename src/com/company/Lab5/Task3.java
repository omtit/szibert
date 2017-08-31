package com.company.Lab5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double K,R1,R2;
        K=s.nextInt();
        R1 = Math.sqrt(K);
        R2 = Math.pow(K, 2);
        if (K>0) {
            System.out.printf("%.0f", R1);
        }
        else {
            System.out.printf("%.0f", R2);
        }


        }
    }

