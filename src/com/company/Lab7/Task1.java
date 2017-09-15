package com.company.Lab7;

import java.util.Scanner;

/**
 * Created by pro-29 on 15.09.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="abcdefwxyz";
        String x=s.nextLine();
        if (str.contains(x)){
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }
}
