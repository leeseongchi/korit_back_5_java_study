package com.study.ch04;

public class Operation05 {
    public static void main(String[] args) {
        /*
         * << 연산자 >>
         *
         * 산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자
         * */

        /*
            << 문제 >>

         int x = 1;
         int y = 1;

         x와 y중 하나라도 값이 0이면 결과는 "오류"
         사분면
         x 양수이면서 y도 양수 => "1사분면"
         x 음수이면서 y가 양수 => "2사분면"
         x 음수이면서 y도 음수 => "3사분면"
         x 양수이면서 y가 음수 => "4사분면"

         */

        int x = 1;
        int y = 1;

        String result = x > 0 && y > 0 ? "1사분면"
                : x < 0 && y > 0 ? "2사분면"
                : x < 0 && y < 0 ? "3사분면"
                : x > 0 && y < 0 ? "4사분면" : "오류";

        String result2 = x == 0 || y == 0 ? "오류"
                : x > 0 ? (y > 0 ? "1사분면" : "4사분면")
                : (y > 0 ? "2사분면" : "3사분면");

        System.out.println("결과: " + result);



    }
}
