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
        if (CA>CB) {
            System.out.println("Значение CA должно быть меньше CB");
        }
        if (CA<0 || CB<0) {
            System.out.println("Значение CA должно быть в интервале [0,длина строки)");
        }
        String b=str.substring(CA,CB+1);
        System.out.println(b);
    }
}
