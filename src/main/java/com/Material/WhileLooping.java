package com.Material;

import java.util.Scanner;

/**
 * InnerLooping
 */
public class WhileLooping {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        while (i-- < 0) {
            System.out.println(i);
        }

        // String s = in.next();
        // while (!s.equals("berhenti")) {
        //     System.out.println(s);
        //     s = in.next();
        // }

        in.close();
    }
}
