package com.company.Lab7;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "jijjbjjcidihddbjbcjdjhjdjijjahahdhjcfjcghcjgjgbjdcijibgjbajhdbjhjacgbdijjbdjdjhjigjjgigjahbjjihgic" +
                "caaijjajjjijjiiidfgfhgbjjdjajjfhdjajffjhbjghjijabfihbgjjibdjbcgjhjjjbdjibjhjccjjjfjicjjjdjdjjjfjhjhjf" +
                "fjjfbfhhfdhjdjibdjgadcajdjdajhjcijghgijjgchdjadjjdgfbibjjaaijfjcjgjdafcjbhabiggigdccjccjghjadaacffjaj" +
                "icfdijfacjcdfjhhigbjhhhjcbhhfcicbadjgjjddbhhfjfhgjjbbgijijcjgjjccdjifcjjcgfjjhcdhcabggfiabchjjfbbdbjj" +
                "jgfcdiadcfffjjgbdjjdahhjjaijjdjfddhahjabaacdhahafghjaajchjcdjaihijjdcajhdigiaafhjiijgjfhdjijigjchbhda" +
                "bacijcajjhfjfgjahffjbahfjjdjgiiahjajjdjfggihajjgjffgjjdhajjjjhcjdjbgjjdjbjjaadhdfhdijaijhaijfhibdadib" +
                "jcjdfbjigjcjhaijfghbfcjfjagchjhcadjbdbbjhjgdhbjjjfjihchjahgjajgaficjjfjjdjhjjdjajaadgfbdccgjhhajicjda" +
                "hcjjajjgjjjijbijigbjbaihjgiahjfhjbjjajbjcfcjcajjdjcghicdjdjgbcjijfcacjccjijjffdjigjjhjfcdhbbjhgjfhjga" +
                "jjgjhdiachhjjjdajjidgbigicjdbjjhdgjihdjcjgijjdgfjgjaaghjjgddjhcfddaajjbjbiahijdajjjbfaachjgidgcjjahfd" +
                "hcabdfjhjjaifhjjbbgjchjicjjcajhbbcjbgjjjabhdgjcggajhhddbgajjfjajfcccifaibagjcbfjaihdhhbdfijjf";
        String a = s.nextLine();
        if (a.length() > 1 || a.length() < 1) {
            System.out.println("Нужно ввести ровно один символ");
        }
        int f = 0;
        int i;
        i = str.indexOf(a, f);
        while (i >= 0) {
            System.out.print(i + " ");
            f = i + 1;
            i = str.indexOf(a, f);
        }
    }
}
