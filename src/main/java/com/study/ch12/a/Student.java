package com.study.ch12.a;

public class Student {

    private String name;
    private String address;

    // private 이면 생성자 호출이 불가능해진다.
    public Student() {

    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void test() {
        System.out.println(add(10, 20));
        System.out.println(add(20, 30));
        System.out.println(add(40, 50));
    }

    private int add(int a, int b) {
        return a + b;
    }
}
