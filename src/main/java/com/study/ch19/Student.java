package com.study.ch19;


public class Student {

    private String name;
    private String address;
    private int age;

    @Override
    public String toString() {
        return "Student(" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ')';
    }

    // 4번째 순서
    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // 2번째 순서
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    // 1번째 순서
    public static class StudentBuilder {
        private String name;
        private String address;
        private int age;

        // 5번째 순서
        public Student build() {
            return new Student(name, address, age);
        }

        // 3번째 순서
        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
}
