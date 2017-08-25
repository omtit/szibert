package com.company.Lab5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Integer p,q;
        Scanner s=new Scanner(System.in);
        p=s.nextInt();
        q=s.nextInt();
        if (p<q) {
            System.out.printf("Максимальное %d, минимальное %d",q,p);
        }else{
            System.out.printf("Максимальное %d, Минимальное %d",p,q);
        }
    }
}
