package com.company.Lab8;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String x;
        x=s.nextLine();
        String[] sarr="11,13,17,19,10,12,14,15,16,18,20".split(",");
        int z=0;
        while (z<sarr.length) {
            if (sarr[z].equals(x)) {
                System.out.println(sarr[z] + "+");
            }else {
                System.out.println(sarr[z]);
            }
            z = z + 1;
        }
    }
}
