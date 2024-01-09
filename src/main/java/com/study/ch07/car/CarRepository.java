package com.study.ch07.car;

public class CarRepository {

    void saveCar(Car car) {
        CarDB carDB = new CarDB();
        carDB.carDataBase(car);
    }
}
