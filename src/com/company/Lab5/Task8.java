package com.company.Lab5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=b*b-4*a*c;
        if (a==0){
            System.out.printf("Данное уравнение не является квадратным");
            return;
        }
        if (d<0){
            System.out.printf("Вещественных корней уравнения %dx^2+%dx+%d=0 нет",a,b,c);
            return;
        }
        if (d==0){
            System.out.printf("Уравнение %dx^2+%dx+%d=0 имеет один корень",a,b,c);
            return;
        }
        if (d>0){
            System.out.printf("У уравнения %dx^2+%dx+%d=0 два вещественных корня",a,b,c);
        }

    }
}
