package com.study.ch10;
    // 인터페이스는 다중구현이 가능하다.

public interface Power {
    // 기본적으로 모든 메소드가 추상 메소드이다.
    // abstract class 기본값 : 일반 클래스
    // interface class 기본값: 추상 메소드

    // 인터페이스는 변수선언이 불가능하다.
//    boolean powerState;
    // static 상수선언은 가능하다.
    String ERROR_CODE = "-9999";

    void setPowerOn();
    void setPowerOff();

    // default 를 붙이면 일반메소드 정의 가능하다.
    default void test() {

    }


}
