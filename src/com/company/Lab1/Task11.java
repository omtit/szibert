package com.company.Lab1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Integer cx,cy,r;
        String a;
        Scanner s=new Scanner(System.in);
        cx=s.nextInt();
        cy=s.nextInt();
        r=s.nextInt();
        a=s.nextLine();
        System.out.printf("<circle cx=\"%d\" cy=\"%d\"\n" +
                " r=\"%d\" fill=\"%s\"/>",cx,cy,r,a);

    }
}
