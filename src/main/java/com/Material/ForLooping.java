package com.Material;

import java.util.Scanner;

/**
 * ForLooping
 */
public class ForLooping {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }

        in.close();
    }
}
