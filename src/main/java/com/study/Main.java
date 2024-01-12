package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int arr[] = new int[a];

        for(int i = 0; i < a; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            arr[i] = A + B;
        }
        for(int C : arr) {
            System.out.println(C);
        }

    }
}