package com.Material;

import java.util.Scanner;

/**
 * DoWhileLooping
 */
public class DoWhileLooping {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        do {
            System.out.println(i);
        } while (i-- < 0);

        // String s = in.next();
        // do {
        //     System.out.println(s);
        //     s = in.next();
        // } while (!s.equals("berhenti"));

        in.close();
    }
}
