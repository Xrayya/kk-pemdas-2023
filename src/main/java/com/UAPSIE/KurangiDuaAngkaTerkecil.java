package com.UAPSIE;

import java.util.Scanner;

/**
 * KurangiDuaAngkaTerkecil
 */
public class KurangiDuaAngkaTerkecil {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min1 = 100000, min2 = 100000;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x < min1) {
                min2 = min1;
                min1 = x;
                continue;
            }
            if (x < min2) {
                min2 = x;
            }
        }
        System.out.println(Math.abs(min1 - min2));

        in.close();
    }
}
