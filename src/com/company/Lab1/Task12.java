package com.company.Lab1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        String user, pass, host, port, db;
        Scanner s=new Scanner(System.in);
        user=s.nextLine();
        pass=s.nextLine();
        host=s.nextLine();
        port=s.nextLine();
        db=s.nextLine();
        System.out.printf("User ID=%s;Password=%s;\n" +
                "Host=%s;Port=$PORT;Database=$%s;",user,pass,host,port,db);
    }
}
