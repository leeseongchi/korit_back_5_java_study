package com.study.ch08.car;

public class CarService {

    // 클래스는 변수와 메소드를 생성할 수 있다.
    CarRepository carRepository;

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    boolean isFull() {
//        return carRepository.getEmptyCount() == 0;
        return carRepository.getEmptyIndex() == -1;
    }

    void append(Car car) {
//        for(int i = 0; i < cars.length; i++) {
//            if(cars[i] == null) {
//                cars[i] = car;
//                break;
//            }
//        }
        carRepository.insert(car);
    }

    void printCarList() {
        Car[] cars = carRepository.getCarDatas();
        if(cars.length == 0) {
            System.out.println("등록된 차량이 없습니다.");
            return;
        }
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

}
