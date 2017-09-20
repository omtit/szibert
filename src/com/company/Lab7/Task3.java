package com.company.Lab7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcdefwxyz";
        String CA = s.nextLine();
        if (str.contains(CA)) {
            String CB = s.nextLine();
            if (str.contains(CB)) {
                int ca = str.indexOf(CA);
                int cb = str.indexOf(CB);
                if (ca < cb) {
                    String a = str.substring(ca + 1, cb);
                    System.out.println(a.length());
                }
                if (cb < ca) {
                    String a = str.substring(cb + 1, ca);
                    System.out.println(a.length());
                }
            } else {
                System.out.println("Значение CB отсутствует в строке");
            }
        } else {
            System.out.println("Значение CA отсутствует в строке");
        }
    }
}