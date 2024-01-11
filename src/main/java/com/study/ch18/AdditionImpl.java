package com.study.ch18;

public class AdditionImpl implements Addition {
    @Override // 변수형태는 상관이 없고, 자료형만 같으면 된다.
    public int add(int a, int b) {
        System.out.println("AdditionImpl에서 호출한 add 메소드");
        return a + b;
    }
}
