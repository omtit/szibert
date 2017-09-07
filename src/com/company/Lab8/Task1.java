package com.company.Lab8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        int[]arr;
        arr=new int[4];
        String str=s.nextLine();
        a=s.nextInt();
        String[] sarr=str.split(" ");
        System.out.println(sarr[a]);
    }
}
