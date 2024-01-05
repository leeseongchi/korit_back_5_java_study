package com.study.ch08;

public class TestA01 {
    public static void main(String[] args) {
        // 클래스 = 변수, 메소드를 가진다.

        int num = 10;
        int num2 = 20;
        int[] nums = new int[3];

        TestB01 bClass = new TestB01();
        bClass.add(nums, num, num2);
        bClass.showArrayDatas(nums);

        bClass.add(nums, 20, 40);
        bClass.showArrayDatas(nums);
    }
}
