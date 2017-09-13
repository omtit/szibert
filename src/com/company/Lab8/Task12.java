package com.company.Lab8;

import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String x;
        x=s.nextLine();
        String[] sarr="a,b,c,d,e,f,g,h".split(",");
        int z=0;
        while (z<sarr.length) {
            if (sarr[z].equals(x)) {
                System.out.println(sarr[z] + "+");
            } else {
                System.out.println(sarr[z]);
            }
            z = z + 1;
        }

    }
}
