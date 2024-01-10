package com.study.ch14;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// final 매개변수 생성 때 쓰임. NoArg 랑 같이 쓸 수 없다.
// AllArg 랑은 쓸 수 있다.
@RequiredArgsConstructor
@Data
public class Student2 {

    private final String name;
    private String address;
    // final 은 상수이기 때문에 값을 변경할 수 없다. NonNull 은 상수가 아니기 때문에 값을 변경할 수 있다.
    // 그래서 final 은 Setter 를 쓸 수 없고, NonNull 은 Setter 를 쓸 수 있다.
    @NonNull
    private String phone;
}
