package com.company.Lab6;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum1 = 0, sum2 = 0, a;
        do {
            a = s.nextInt();
            sum1 = sum1 + a;
        } while (a <= 83 && a >= 199);
        do {
            a = s.nextInt();
            sum2 = sum2 + a;
        } while (a <= 83 && a >= 199);
        System.out.printf("Сумма слева: %d, сумма справа: %d", sum1, sum2);
    }
}
