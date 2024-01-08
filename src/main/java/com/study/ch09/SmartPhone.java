package com.study.ch09;

public class SmartPhone extends ElectronicDevice {

    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");
    }

    // 오버라이드 재정의
    // 업캐스팅을 해서 부모의 변수명과 같더라도 재정의한 자식 클래스에 변수명을 우선순위로 가진다.
//    void showDeviceState() {
//        System.out.println("스마트폰 전원 상태: " + ((powerState) ? "켜짐" : "꺼짐"));
//    }

    @Override // @로 시작하면 어노테이션
    void showDeviceState() {
        super.showDeviceState();
    }
}
