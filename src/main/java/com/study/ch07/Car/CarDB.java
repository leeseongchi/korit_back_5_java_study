package com.study.ch07.Car;

public class CarDB {

    void carDataBase(Car car) {
        System.out.println("DB에 전달 완료");
        System.out.println("전달 내용");
        System.out.println("제조사: " + car.manufacturer);
        System.out.println("이름: " + car.name);
        System.out.println("종류: " + car.kind);
        System.out.println("제로백: " + car.zeroBack + "초");
    }
}
