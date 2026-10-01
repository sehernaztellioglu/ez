package org.example;


import java.util.Scanner;

public class Main{



    public static int eslesenHarfSayisi (String eslenen,String esleyen){

        int sayac = 0;




        if(eslenen.length() == esleyen.length()){
            sayac++;
        }

        char[] String1 = eslenen.toCharArray();
        char[] String2 = esleyen.toCharArray();


        boolean[] kullanildi = new boolean[esleyen.length()];

        for (int i = 0; i < eslenen.length(); i++) {
            for (int j = 0; j < esleyen.length(); j++) {
                if (!kullanildi[j] && String1[i] == String2[j]) {
                    sayac++;
                    kullanildi[j] = true;
                    break;
                }
            }
        }

        return sayac;


    }


    public static int harfLokasyonlari(String x, String y) {
        int sayac = 0;

        for (int i = 0; i < Math.min(x.length(), y.length()); i++) {
            if (x.charAt(i) == y.charAt(i)) {
                sayac++;
            }
        }

        return sayac;
    }






    public static void main(String[] args){

        double yuzde = 0;

        Scanner scanner = new Scanner(System.in);


        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();



        yuzde = (eslesenHarfSayisi(input1, input2)
                + harfLokasyonlari(input1, input2))
                * 100.0 / (Math.max(input1.length(), input2.length()) * 2);

        System.out.println(yuzde);


    }
}