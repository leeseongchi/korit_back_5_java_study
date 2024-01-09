package com.study.ch13;

public class Factory {
    // 싱글톤의 특징
    // 자기 자신 클래스를 스태틱 변수(변수명: instance)로 가지고 있어야한다.
    private static Factory instance;
    private String factoryName;
    private int autoCount;
    private final int DEFAULT_NUMBER = 20240000;

    // 생성자는 private 으로 외부 생성을 막아준다.
    private Factory() {}

    // 싱글톤 매우중요******
    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Car produce(String model) {
        autoCount++;
        return new Car(Integer.toString(DEFAULT_NUMBER + autoCount), model);
//        return new Car("" + DEFAULT_NUMBER, autoCount), model);
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFAULT_NUMBER=" + DEFAULT_NUMBER +
                '}';
    }
}
