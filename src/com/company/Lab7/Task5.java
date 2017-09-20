package com.company.Lab7;

import java.util.Scanner;

/**
 * Created by pro-29 on 15.09.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="abcdefwxyz";
        int CA, CB;
        CA=s.nextInt();
        CB=s.nextInt();
        if (CA<0 || CA>str.length()) {
            System.out.println("Значение CA должно быть в интервале [0,длина строки)");
            return;
        }
        if (CB<0 || CB> str.length()) {
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
            return;
        }
        if (CA>CB) {
            System.out.println("Значение CA должно быть меньше CB");
            return;
        }
        String b=str.substring(CA,CB+1);
        System.out.println(b);
    }
}
