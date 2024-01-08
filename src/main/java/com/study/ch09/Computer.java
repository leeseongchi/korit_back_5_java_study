package com.study.ch09;

public class Computer extends ElectronicDevice {

    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }

    // 오버라이드 재정의
    // 업캐스팅을 해서 부모의 변수명과 같더라도 재정의한 자식 클래스에 변수명을 우선순위로 가진다.
//    void showDeviceState() {
//        System.out.println("컴퓨터 전원 상태: " + ((powerState) ? "켜짐" : "꺼짐"));
//    }
    void showDeviceState() {
        System.out.print("컴퓨터");
        super.showDeviceState();
    }
}
