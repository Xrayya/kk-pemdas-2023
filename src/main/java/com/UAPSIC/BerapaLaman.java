package com.UAPSIC;

import java.util.Scanner;

/**
 * BerapaLaman
 */
public class BerapaLaman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int side = c / 2;
        int start = b - side;
        int akhir = b + side;
        if (start <= 0) {
            int sisa = Math.abs(start) + 1;
            start = 1;
            akhir = akhir + sisa;
        }
        if (akhir > a) {
            start = start - (akhir - a);
            akhir = a;
        }
        if (b != 1)
            System.out.print("Prev ");
        for (int i = start; i <= akhir; i++) {
            System.out.printf("%d ", i);
        }
        if (b != a)
            System.out.print("Next");

        in.close();
    }
}
