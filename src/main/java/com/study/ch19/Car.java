package com.study.ch19;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Car {

    private String model;
    private String color;

    // @Builder 안 썼을 때 써야하는 코드(밑에까지 전부다)
    // AllArg를 함으로써 build 에 입력된 Car 랑 연결이 되어 model, color 가 호출이 된다.
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public static CarBuilder builder() {
        // static 없이 생성을 하러면 Car 클래스를 생성해야한다.
//        Car car = new Car();
//        return new Car.CarBuilder();
        // CarBuilder 생성자를 만든다.
        return new CarBuilder();
    }

    // 내부 클래스
    public static class CarBuilder {
        private String model;
        private String color;

        // build 호출할 때 new Car 에 model, color 를 값주입 하겠다.
        public Car build() {
            return new Car(model, color);
        }

        public CarBuilder model(String model) {
            // CarBuilder 에 model 이다.
            this.model = model;
            // CarBuilder 에 반환해준다.
            return this;
        }

        public CarBuilder color(String color) {
            // CarBuilder 에 color 이다.
            this.color = color;
            // CarBuilder 에 반환해준다.
            return this;
        }
    }


}
