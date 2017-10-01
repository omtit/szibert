package com.company.Lab2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aRemainder, aInitial = s.nextInt();
        aRemainder = aInitial % 360;
        System.out.println(aRemainder);
    }
}
