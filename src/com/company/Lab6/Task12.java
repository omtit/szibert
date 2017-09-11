package com.company.Lab6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, B, y, sum;
        B = s.nextInt();
        x = -10;
        y = 10000;
        sum = 0;
        if (B < x || B > y) {
            System.out.println("Значение b должно быть в интервале [-10,10000]");
        } else {
            while (x <= B) {
                sum = sum + B;
                B = B - 1;
            } System.out.print(sum);
        }
    }
}
