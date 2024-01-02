package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {

        StudentType studentType = new StudentType();
        studentType.name = "김준일";
        studentType.studentYear = 1;
        studentType.address = "부산 동래구";

        System.out.println("이름: " + studentType.name);
        System.out.println("학년: " + studentType.studentYear + "학년");
        System.out.println("주소: " + studentType.address);

        int a = 10;
        double b = a;

        Person p = studentType;
        StudentType studentType1 = (StudentType) p;

//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;

        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;


    }
}
