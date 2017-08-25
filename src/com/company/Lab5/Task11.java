package com.company.Lab5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if (a<b && b<c){
            System.out.println("\"Выполняется\"");
        }
        else {
            System.out.println("\"Не выполняется\"");
        }
    }
}
