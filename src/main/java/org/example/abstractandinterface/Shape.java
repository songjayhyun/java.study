package org.example.abstractandinterface;

// 추상 클래스는 하나 이상의 추상 메소드를 갖는 클래스
// 상속 관계에서 부모 클래스의 역할을 갖기 위한 클래스이며, 추상 메소드와 일반 메소드를 가질 수 있다.
// 추상 메소드는 메소드 몸체가 없는 메소드이며 자식 클래스를 갖기 위함
// new 동적 할당자를 통해 인스턴스 객체 생성이 불가능

public abstract class Shape {

    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public abstract void draw();
}


