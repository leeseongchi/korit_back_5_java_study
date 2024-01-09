package com.study.ch07.car;

public class CarService {

    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }
        return str.isBlank();
    }

    void carSaver(Car car) {
        CarRepository carRepository = new CarRepository();

        System.out.println("자동차 서비스센터까지 전달함.");

        carRepository.saveCar(car);
    }
}
