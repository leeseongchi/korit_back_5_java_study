package com.study.ch13;


/*
    Company 클래스를 싱글톤을 적용하여 구현하시오.
 */

public class Company {

    // 싱글톤 세트!! (name 제외)
    private static Company instance;
    private String name; // 객체안에 사용되는 멤버변수

    private Company() {}

    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
