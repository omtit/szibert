package com.company.Lab8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[]arr=str.split(" ");
        int a=0;
        while (a<arr.length) {
            System.out.println(arr[a]+" "+a);
            a=a+1;
        }
    }
}
