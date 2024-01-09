package com.study.ch07.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        CarService carService = new CarService();
        Scanner scanner = new Scanner(System.in);
        
        String manufacturer = null;
        String name = null;
        String kind = null;
        int zeroBack = 0;

        System.out.println("자동차 정보");

        System.out.print("자동차 제조사: ");
        manufacturer = scanner.nextLine();
        if (carService.isEmptyString(manufacturer)) {
            System.out.println("다시 입력해주세요.");
            return;
        }

        System.out.print("자동차 이름: ");
        name = scanner.nextLine();
        if (carService.isEmptyString(name)) {
            System.out.println("다시 입력해주세요.");
            return;
        }

        System.out.print("자동차 종류: ");
        kind = scanner.nextLine();
        if (carService.isEmptyString(kind)) {
            System.out.println("다시 입력해주세요.");
            return;
        }

        System.out.print("자동차 제로백: ");
        zeroBack = scanner.nextInt();

        Car car = new Car(manufacturer, name, kind, zeroBack);

        carService.carSaver(car);

    }
}
