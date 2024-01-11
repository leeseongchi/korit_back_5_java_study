package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {

        // value 값 중복이 가능하다.
        // key 값 중복은 불가능.
        // set 처럼 key 값에 순서가 없다.
        HashMap<String, String> map = new HashMap<>();

        map.put("1번학생","김준일");
        map.put("2번학생","김준이");
        map.put("3번학생","김준삼");
        map.put("4번학생","김준사");

        map.put("username","junil");
        map.put("password","1234");
        map.put("name","김준일");
        map.put("email","skjil1218@kakao.com");

        System.out.println(map);
        System.out.println(map.get("3번학생"));
        System.out.println(map.get("email"));
    }
}
