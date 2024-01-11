package com.study.ch17;

import javax.security.auth.callback.ConfirmationCallback;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add("김준이");

        System.out.println(nameList);

        // set 은 수정이란 개념이 없다.
        // 데이터 값을 바꾸려면 값을 꺼내서 제거하고 add 로 추가해야한다.
        // set 은 중복제거할 때 쓴다.
        // List 로 addAll 이 가능하다.
        HashSet<String> names = new HashSet<>();
        names.addAll(nameList);

        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Objects.hash(o1) - Objects.hash(o2);
//                return Objects.hash(o2) - Objects.hash(o1); // 역정렬도 가능함
            }
        });
        System.out.println(newNameList);

        String findName = null;

        // 값을 꺼내야하므로 index 가 아닌 for each 문으로 꺼낸다.
        for(String name : names) {
            if(name.equals("김준삼")) {
                findName = name;
                break;
            }
        }
        System.out.println(findName);
    }
}
