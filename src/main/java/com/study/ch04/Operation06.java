package com.study.ch04;

public class Operation06 {
    public static void main(String[] args) {
        /*
         * << 연산자 >>
         *
         * 산술연산자, 비교연산자, 논리연산자, 조건연산자, 복합대입연산자
         * */

        /*
            조건연산자(삼항연산자)

            a > 0 ? "양수" : a == 0 ? "0" : "음수"

         */

        int iResult = 10 > 2 ? 1111 : 2222;
        Integer iResult2 = null;

        String sResult = 10 > 2 ? "1111" : "2222";
        Boolean bResult = 10 > 2;

        Boolean.parseBoolean("true");

        String name = null; // null = 주소가 없다 , 값이 비어있다.
        System.out.println(name == null);
        System.out.println(name == null);
        System.out.println("테스트 코드 작성");


        String name1 = "김준일";
        String name2 = new String("김준일");

        System.out.println(name1 == name2);
        System.out.println(name1 == "김준일");



    }
}
