package com.study.ch18;

public class AdditionMain {

    public static void main(String[] args) {

        // 익명 클래스
        // 딱 한번만 쓰고 버릴 때 쓰인다.
        Addition addition1 = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        Addition addition2 = new AdditionImpl();

        System.out.println(addition1.add(10, 20));
        System.out.println(addition2.add(30, 40));

        // 람다(lambda)식
        // 람다식 핵심조건 -> 인터페이스 안에 딱 하나의 추상메소드만 정의되어 있어야 한다.
        // 단, 일반(default) 메소드는 여러개 정의되어 있어도 된다.
        // -> 를 add 함수라고 생각하면 된다.
        Addition addition3 = (int x, int y) -> {
            System.out.println("람다식으로 구현한 add메소드");
            return x + y;
        };

        System.out.println(addition3.add(50, 60));

        // 1. 람다식의 매개변수 자료형은 생략할 수 있다.
        Addition addition4 = (x, y) -> {
            return x + y;
        };

        // 2. 함수의 실행문이 하나의 명령문만 실행된다면 중괄호를 생략할 수 있다.
        // 단, return 은 중괄호를 생략할 시에 같이 생략한다.
        Addition addition5 = (x, y) -> x + y;
        Viewer viewer1 = (viewData) -> {
            System.out.println("화면 출력");
        };
        Viewer viewer2 = (Viewer) -> System.out.println("화면 출력");

        // 3. 매개변수가 1개면 매개변수의 괄호를 생략할 수 있다.
        Viewer viewer3 = viewData -> System.out.println("화면 출력");
    }
}
