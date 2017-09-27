package com.company.Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String filename = "res/files/task4954/test" + s.nextInt() + ".txt";
        File f = new File(filename);
        if (!f.exists()) {
            System.out.println("Файл " + f.getAbsolutePath() + " не существует");
            return;
        }
        try {
            Scanner fReader = new Scanner(f);
            int x = 0;
            if (fReader.hasNext()) {
                while (fReader.hasNext()) {
                    String l = fReader.nextLine();
                    if (l.contains(A)) {
                        x++;
                    }
                    System.out.println(x);
                }
            } else {
                System.out.println("0");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

