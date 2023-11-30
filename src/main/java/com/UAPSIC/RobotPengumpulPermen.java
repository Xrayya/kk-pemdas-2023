package com.UAPSIC;

import java.util.Scanner;

/**
 * RobotPengumpulPermen
 */
public class RobotPengumpulPermen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n++;

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1)
                    continue;
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 1; j < n; j++) {
                arr[i][j] = Math.max(arr[i][j] + arr[i + 1][j], arr[i][j] + arr[i][j - 1]);
            }
        }
        System.out.println(arr[0][n - 1]);

        in.close();
    }
}
