package org.example.lambda;

@FunctionalInterface
public interface FunctionalInterfaceClass {

    // 람다 표현식은 익명 구현 클래스를 생성하고 객체화 한다.
    // 익명 구현 클래스로 생성된 람다 표현식은 인터페이스로 대입 가능하여 이 인터페이스를 함수형 인터페이스라고 한다.
    // 오직 하나의 추상 메소드를 갖는 인터페이스는 모두 함수형 인터페이스가 될 수 있다.
    // @FunctionalInterface

    // 오직 함수형 인터페이스 타입으로만 형변환이 가능하다

    abstract int testMethod(int a, int b);

}
