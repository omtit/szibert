package com.company.Lab6;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0, count = 0, a;
        do {
            a = s.nextInt();
            sum = sum + a;
            count = count + 1;
        } while (sum<1000);
        System.out.printf("%d",count);
    }
}
