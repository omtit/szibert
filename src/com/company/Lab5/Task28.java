package com.company.Lab5;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double A,B,C,D;
        A=s.nextInt();
        B=s.nextInt();
        C=s.nextInt();
        D=s.nextInt();
        if (A<C && B<D) {
            System.out.println("Размещение возможно");
            return;
        }
        if (A<0) {
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }
        if (B<0) {
            System.out.println("Значение B должно быть неотрицательным");
            return;
        }
        if (C<0) {
            System.out.println("Значение C должно быть неотрицательным");
            return;
        }
        if (D<0) {
            System.out.println("Значение D должно быть неотрицательным");
        }
        else {
            System.out.println("Размещение невозможно");
        }
    }
}
