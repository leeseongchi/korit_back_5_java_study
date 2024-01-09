package com.study.ch10;

public class RemoteController extends ElectronicDevice {
    // Ctrl + I 는 무조건 써야하는 implement 만 뜬다.
    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
}
