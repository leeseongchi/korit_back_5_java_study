package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
    // 제네릭: 자료형을 유동적으로 바꿔주는 것.
    // 일반 자료형은 쓸 수가 없다.
    // 클래스 참조 자료형만 가능하다.
    // T = Type(타입) , R = Return(리턴), E = element(요소)
public class SendData<T> {

    private int code;
    // Object 를 썼을 때 객체들을 쓰려면 다운캐스팅을 해서 써야한다.
//    private Object data;
    private T data;

    public void send() {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }
}
