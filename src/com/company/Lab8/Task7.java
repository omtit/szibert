package com.company.Lab8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");
        int P,Q;
        P=s.nextInt();
        Q=s.nextInt();
        String cup;
        cup=arr[P];
        arr[P]=arr[Q];
        arr[Q]=cup;
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
     }
}
