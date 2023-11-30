package com.UAPSIE;

import java.util.Scanner;

/**
 * JumlahSampaiDapatSatuAngka
 */
public class JumlahSampaiDapatSatuAngka {

    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while (s.length() != 1) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
            }
            s = String.valueOf(sum);
        }
        System.out.println(s);

        in.close();
    }
}
