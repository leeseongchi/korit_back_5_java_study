package com.study.ch14;


import java.util.Objects;

/*
 * Object 클래스
 */
public class ObjectTest {
    // 모든 클래스는 Object 클래스를 상속받고 있다.

    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
        // s 가 붙으면 도구로 쓰인다.
        // 도구로 쓰이는 것들은 static 을 쓰고 있다.
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
