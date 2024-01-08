package com.study.ch08.car;

public class CarRepository {

    // 생성자와 함수의 차이점
    // 1. 생성자는 이름(자료형)과 클래스명이 일치 / 함수는 자유롭게 함수명을 지정할 수 있다.
    // 2. 생성자는 리턴 x (생성자는 무조건 주소를 리턴해주기 때문에)/ 함수는 리턴값과 리턴 자료형이 존재한다.

    final Car[] cars;

    CarRepository(Car[] cars) {
        this.cars = cars;
    }

//    int getEmptyCount() {
//        int emptyCount = 0;
//        for (int i = 0; i < cars.length; i++) {
//            if(cars[i] == null) {
//                emptyCount++;
//            }
//        }
//        return emptyCount;
//    }

    int getEmptyIndex() {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Car car) {
        cars[getEmptyIndex()] = car;
    }

    Car[] getCarDatas() {
        int carCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                carCount++;
            }
        }
        Car[] newCars = new Car[carCount];
        int j = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;
    }

}
