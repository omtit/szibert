package com.company.Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.nextLine();
        String filename = "res/files/task6861/test" + s.nextInt() + ".txt";
        File f = new File(filename);
        if (!f.exists()) {
            System.out.println("Файл " + f.getAbsolutePath() + " не существует");
            return;
        }
        try {
            Scanner fReader = new Scanner(f);
            if (fReader.hasNext()) {
                String l = fReader.nextLine();
                if (l.matches("[0-9a-zA-Z_]+@[a-z]*.[a-z]*")) {
                    System.out.println(l);
                }
                Pattern pattern = Pattern.compile("([0-9a-zA-Z]+)@([a-z]*).[a-z]*");
                Matcher matcher = pattern.matcher(l);
                while (matcher.find()) {
                    System.out.println(matcher.group(0));
                    System.out.println(matcher.group(1));
                    System.out.println(matcher.group(2));
                }
            } else {
                System.out.println("0");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
