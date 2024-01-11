package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {

    public static void main(String[] args) {
        // 매개변수 x 반환값 x 메서드 - void run()
        Runnable start = () -> {
            System.out.println("프로그램을 실행합니다.");
            System.out.println("데이터를 초기화 합니다.");
            int a = 10;
            int b = 20;
            System.out.println("a + b = " + (a + b));
            // 함수 안에서 함수를 정의할 수 없다.
            // 람다식 안에서는 함수를 정의할 수 있다.
        };

        start.run();

        // 매개변수 x 반환값 o 메소드 - T get()
        Supplier<Integer> supplier1 = () -> 10;

        int a = supplier1.get();

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);
//        scannerInstance.get().nextLine();

        // 매개변수 o 반환값 x 메소드 - void accept(T t)
        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);
        };

        setName.accept("김준일");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = str -> System.out.println(str);
        action.accept("김준일");

        // 변수를 매개변수에 담았을 때
        strList.forEach(action);
        // 객체를 매개변수에 담았을 때
        strList.forEach(str -> System.out.println(str));

        // 매개변수 o 반환값 o 메소드 - R apply(T t)
        Function<Integer, String> fx1 = num -> Integer.toString(num * num);

        String result = fx1.apply(10);
        System.out.println(result);

        // andThen 은 순서대로 출력하게끔 만들어 준다.
        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result2);

        // 매개변수 o 반환값 o 메소드 - boolean test(T t)
        Predicate<Integer> filterFx = num -> num % 2 == 0;

        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numList.add(i + 1);
        }
        System.out.println(numList);
        // stream 은 되돌릴 수가 없다.
        // list 공간을 stream 공간에 카피한다.
        // num에서 값을 꺼내서 num % 2 == 0 조건이 참이면 담고 거짓이면 버린다.
        // 최종적으로 stream에 담긴것을 collect로 list에 저장하여 tolist로 출력을 한다.
        List<Integer> newList = numList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList2 = newList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2);



    }
}
