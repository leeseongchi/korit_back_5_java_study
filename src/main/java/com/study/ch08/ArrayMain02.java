package com.study.ch08;

public class ArrayMain02 {
    public static void main(String[] args) {

        String[] names = new String[10];
        names[0] = "최수현";
        names[1] = "전주환";
        names[2] = "서창현";
        names[3] = "예홍렬";

        for (int i = 0; i < names.length; i++) { // length가 자료형의 갯수를 가져와준다.
            System.out.println(names[i]);
        }

    }
}
