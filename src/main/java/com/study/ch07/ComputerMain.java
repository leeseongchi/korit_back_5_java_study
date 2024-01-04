package com.study.ch07;

public class ComputerMain {
    public static void main(String[] args) {
        // 클래스에 정의된 함수 = 메소드
        // 생성자는 무조건 주소값을 리턴
        // 그래서 리턴자료형이 없음
        Computer computer1 = new Computer(); //생성 , 동적메모리
        Computer computer2 = new Computer("노트북");

        System.out.println(computer1);
        System.out.println(computer2);

        computer1.cpu = "i5";
        computer2.cpu = "i7";

        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);
        computer1.showInfo();
        computer2.showInfo();

        computer1.ram = "8GB";
        computer2.ram = "16GB";

        computer1.showInfo();
        computer2.showInfo();

        computer1.type = "데스크탑";
    }
}
