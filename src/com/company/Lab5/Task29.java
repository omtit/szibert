package com.company.Lab5;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int xt, yt, xn, yn, h, w;
        xt = s.nextInt();
        yt = s.nextInt();
        xn = s.nextInt();
        yn = s.nextInt();
        h = s.nextInt();
        w = s.nextInt();
        if (xt < 0) {
            System.out.println("Координата X должна быть неотрицательной");
            return;
        }
        if (xn < 0) {
            System.out.println("Координата X должна быть неотрицательной");
            return;
        }
        if (yt<0) {
            System.out.println("Координата Y должна быть неотрицательной");
            return;
        }
        if (yn<0) {
            System.out.println("Координата Y должна быть неотрицательной");
            return;
        }
        if (h<1) {
            System.out.println("КВысота должна быть положительна");
            return;
        }
        if (w<1) {
            System.out.println("Ширина должна быть положительна");
            return;
        }
        if (xt>xn && yt>yn && xt<w && yt<h) {
            System.out.println("точка внутри");
        }
        else {
            System.out.println("точка не внутри");
        }

    }
}
