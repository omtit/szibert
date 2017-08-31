package com.company.Lab5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double radius,edge,Sr,Se;
        radius=s.nextDouble();
        edge=s.nextDouble();
        Sr=Math.PI*Math.pow(radius,2);
        Se=Math.pow(edge,2);
        if (radius<0) {
            System.out.println("Радиус должен быть положительным");
            return;
        }
        if (edge<0) {
            System.out.println("Сторона квадрата должна быть положительна");
            return;
        }
        if (Sr<Se) {
            System.out.printf("Площадь квадрата %.4f больше площади круга %.4f", Se, Sr);
        }
        else {
            System.out.printf("Площадь круга %.4f больше площади квадрата %.4f", Sr, Se);
        }
        }

    }

