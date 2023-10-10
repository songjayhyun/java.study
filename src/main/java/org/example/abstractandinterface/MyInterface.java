package org.example.abstractandinterface;

// 필드, 추상 메소드, static 메소드, default 메소드 정의 가능
// java 8부터 인터페이스에 static 메소드 추가 가능

public interface MyInterface {

    String Message = "interface"; // public static final 생략 가능

    default void defaultMethod() {
        System.out.println("MyInterface.defaultMethod");
    }

    static void staticMethod() {
        System.out.println("MyInterface.staticMethod");
    }
}
