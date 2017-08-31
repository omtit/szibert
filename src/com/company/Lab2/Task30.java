package com.company.Lab2;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double Grad1,Grad2,Rad1,Rad2,result;
        Grad1=s.nextDouble();
        Grad2=s.nextDouble();
        Rad1=Grad1*Math.PI/180;
        Rad2=Grad2*Math.PI/180;
        result=Math.sin(Rad1)*Math.cos(Rad2)+Math.cos(Rad1)*Math.sin(Rad2);
        System.out.printf("%.4f",result);
    }
}
