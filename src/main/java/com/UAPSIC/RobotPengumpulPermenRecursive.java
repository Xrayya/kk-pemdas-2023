package com.UAPSIC;

import java.util.Scanner;

/**
 * RobotPengumpulPermenRecursive
 */
public class RobotPengumpulPermenRecursive {

    static int panjang;
    static int[][] matriks;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        panjang = in.nextInt();
        matriks = new int[panjang][panjang];

        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < panjang; j++) {
                matriks[i][j] = in.nextInt();
            }
        }

        int hasil = proses(panjang - 1, 0);
        System.out.println(hasil);

        in.close();
    }

    public static int proses(int posAwalX, int posAwalY) {
        if (posAwalX == matriks.length || posAwalY < 0) {
            return 0;
        }

        int atas = proses(posAwalX, posAwalY + 1);
        int kanan = proses(posAwalX - 1, posAwalY);

        if (atas < kanan) {
            return kanan + matriks[posAwalY][posAwalX];
        } else {
            return atas + matriks[posAwalY][posAwalX];
        }
    }
}
