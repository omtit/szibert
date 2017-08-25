package com.company.Lab5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Integer a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        if (a<b) {
            System.out.println("Второе");
        }else{
            System.out.println("Первое");
        }

    }

}
