package com.company.Lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int edge;
        edge=s.nextInt();
        int volume;
        volume=(int)Math.pow(edge,3);
        System.out.printf("%d",volume);
    }
}
