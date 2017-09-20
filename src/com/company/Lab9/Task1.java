package com.company.Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filename = "res/files/task6175/test" + s.nextInt() + ".txt";
        File f = new File(filename);

        if (!f.exists()) {                                                        //проверка существует или нет (!-не)
            System.out.println("Файл " + f.getAbsolutePath() + " не существует"); //egrAbsolutePath -абсолютный путь
            return;
        }
        try {
            Scanner fileReader = new Scanner(f);
            while (fileReader.hasNext()) {
                String line=fileReader.nextLine()+", ";
                System.out.print(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
