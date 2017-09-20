package com.company.Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filename = "res/files/task4488/test" + s.nextInt() + ".txt";
        File f = new File(filename);

        if (!f.exists()) {
            System.out.println("Файл " + f.getAbsolutePath() + " не существует");
            return;
        }
        try {
            Scanner fReader = new Scanner(f);
            int a=0;
            if (fReader.hasNext()) {
                String l = fReader.nextLine();
                System.out.print(l + " ");
                while (fReader.hasNext()) {
                    String line = fReader.nextLine();
                    a++;
                }
                System.out.print(a);
            } else {
                System.out.println("Файл пуст");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
