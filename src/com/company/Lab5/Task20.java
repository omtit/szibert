package com.company.Lab5;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        x = s.nextInt();
        y = s.nextInt();
        if (y <= 1.5 && y >= -2) {
            System.out.printf("Точка с координатами (%d; %d) принадлежит множеству", x, y);
        } else {
            System.out.printf("Точка с координатами (%d; %d) не принадлежит множеству", x, y);
        }
    }
}
