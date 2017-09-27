package com.company.Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filename = "res/files/task4642/test" + s.nextInt() + ".txt";
        File f = new File(filename);
        if (!f.exists()) {
            System.out.println("Файл " + f.getAbsolutePath() + " не существует");
            return;
        }
        try {
            Scanner fReader = new Scanner(f);
            if (fReader.hasNext()) {
                while (fReader.hasNext()) {
                    String l = fReader.nextLine();
                    String[] arr = l.split(" +");
                    System.out.println(arr.length);
                }
            } else {
                System.out.println("Файл пуст");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
