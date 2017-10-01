package com.company.Lab5;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Xt, Yt, Xn1, Yn1, Xn2, Yn2;
        Xt = s.nextInt();
        Yt = s.nextInt();
        Xn1 = s.nextInt();
        Yn1 = s.nextInt();
        Xn2 = s.nextInt();
        Yn2 = s.nextInt();
        if (Xt < 0 || Yt < 0) {
            System.out.printf("Координата X должна быть неотрицательной");
        } else {
            if (Xt >= Xn1 && Yt <= Yn2) {
                System.out.printf("Точка принадлежит прямой");
            } else {
                System.out.printf("Точка не принадлежит прямой");
            }
        }
    }
}