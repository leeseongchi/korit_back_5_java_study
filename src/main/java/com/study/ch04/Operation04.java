package com.study.ch04;

public class Operation04 {
    public static void main(String[] args) {
        /*
         * << 연산자 >>
         *
         * 산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자
         * */

        /*
            << 문제 >>
            연도가 주어졌을 때, 윤년이면 true,
            아니면 false을 출력하는 프로그램을 작성하시오.

            윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

            예를들어 , 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
            1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
            하지만, 2000년은 400의 배수이기 때문에 윤년이다.

            연도는 0보다 크고, 4001보다 작은 자연수이다.

            int year = 2000; => 결과 true
            int year = 1999; => 결과 false

         */
        int year = 1999;

        boolean result = 0 < year && year < 4001
                        && year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        System.out.println("결과 => " + result);
    }
}
