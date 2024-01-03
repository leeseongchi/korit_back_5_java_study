package com.study.ch06;

public class For02 {
    public static void main(String[] args) {
        /*
        0, 1, 2, 3, 4
         */
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            if (i % 5 != 4) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i % 5 != 4) {
                System.out.print(", ");
            }
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            int rv_i = 10 - 1 - i;
            System.out.print(rv_i);
            if (rv_i % 5 != 0) {
                System.out.print(", ");
            }
            if(rv_i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
