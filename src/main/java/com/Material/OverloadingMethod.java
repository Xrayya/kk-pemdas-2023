package com.Material;

/**
 * OverloadingMethod
 */
public class OverloadingMethod {

    public static void main(String[] args) {
        ;
    }

    public static void overloading() {
        System.out.println("memanggil method overloading1()");
    }

    public static int overloading(int x) {
        return x + 1;
    }

    public static double overloading(double y) {
        return overloading((int) y) * y;
    }

    public static int overloading(int a, int b) {
        return a + b;
    }
}
