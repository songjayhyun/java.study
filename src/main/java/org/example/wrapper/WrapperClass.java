package org.example.wrapper;

public class WrapperClass {

    // 자바의 기본 데이터 단위는 객체이다.
    // 기본 데이터 타입(int, double, float 등 원시)를 객체로 관리할 수 있도록 제공

    // ex) Long, Integer, Boolean, Float, Double

    Integer integer = Integer.valueOf(10);
    int num = integer.intValue();

    Integer integer2 = 10; // auto boxing
    int num2 = integer2;

}
