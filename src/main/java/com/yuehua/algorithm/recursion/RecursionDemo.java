package com.yuehua.algorithm.recursion;

public class RecursionDemo {
    public static void main(String[] args) {
        int fact = fact(19);
        System.out.println(fact);
    }

    private static int fact(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}
