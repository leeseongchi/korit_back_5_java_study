package com.study.ch14;

public class ObjectMain {

    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("김준일", "동래구");

        System.out.println(objectTest.toString());
        System.out.println(objectTest); // 자동으로 toString 이 호출된다.

        ObjectTest objectTest1 = new ObjectTest("김준일", "동래구");

        // package 안에서의 equals 값비교만 true 가 나온다.
        // 클래스끼리 비교할 때 사용한다.
        // override 하기전 equals 는 주소비교이다.
        System.out.println(objectTest.equals(objectTest1));
        System.out.println(objectTest == objectTest1);

        // 주소값이 같다.
        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class);

        // 주소값 비교
        // override 한 후에는 값비교이다.
        System.out.println(objectTest.hashCode());
        System.out.println(objectTest1.hashCode());
    }
}
