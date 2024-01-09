package com.study.ch10;

/*
    [추상화] - 공통점을 뽑아낸다.
    1. 추상 클래스 abstract class
    2. 인터페이스 interface
 */

public abstract class ElectronicDevice {

    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상 메소드가 상속받을때 만 중괄호 없이 정의가 가능하다.
    // 강제성으로 재정의를 하라고 쓰기 위해서 쓰인다.
    abstract void showDeviceState();
//      System.out.println("전원 상태: " + ((powerState) ? "켜짐" : "꺼짐"));
//      |
//      |- > 매번 재정의하면 굳이 쓸 필요가 없다.
}
