package com.UAPSIC;

import java.util.Scanner;

/**
 * FrekuensiKarakter
 */
public class FrekuensiKarakter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ascii = new int[150];
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            ascii[s.charAt(i)]++;
        }
        for (int i = 0; i < 150; i++) {
            if (ascii[i] != 0) {
                System.out.println((char) i + ": " + ascii[i]);
            }
        }

        in.close();
    }
}
