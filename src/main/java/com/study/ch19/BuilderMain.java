package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {

        // builder - static 메소드 여서 new 없이 생성이 가능하다.
        // Car 클래스 안에 CarBuilder 가 static 으로 정의되어서 CarBuilder 를 생성한 것이다.
        Car.CarBuilder carBuilder = Car.builder(); // Car.builder 가 주소다.
        Car car2 = carBuilder.build();

        // 위에 두 줄에 코드를 한 줄로 정리한 것이다.
        Car car = Car.builder().model("아반떼").color("블랙").build();

        System.out.println(car);

        // Builder 패턴에는 AllArg 가 필수적으로 들어가야해서 @Builder 안에 AllArg 가 포함되어 있다.
        // 그래서 Member 객체가 AllArg 없이 생성이 가능하다.
        Member member = new Member("김준일", "01099881916");

        Member member1 = Member.builder()
                .phone("01099881916")
                .name("김준일")
                .build();

    }
}
