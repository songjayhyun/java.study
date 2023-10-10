package org.example.abstractandinterface;

// 추상 메소드만 가지며 interface 키워드를 사용해 정의
// 특정 클래스가 인터페이스를 구현하기 위해선 implements 키워드 사용
// 상속과 달리 하나의 클래스가 둘 이상의 인터페이스를 동시에 구현 가능
// 설계와 구현 분리

public interface IBehavior {

    void play();
}
