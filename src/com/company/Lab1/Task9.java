package com.company.Lab1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String a;
        Scanner s=new Scanner(System.in);
        a= s.nextLine();
        System.out.printf("SELECT first_name, last_name, group\n" +
                "FROM students WHERE id = '%s';",a);

    }
}
