package org.example.generic;

import java.util.ArrayList;

public class NewBox<T extends Fruit> { // Fruit class 상속하는 타입만, 인터페이스도 extend
    // T는 Type Variable 타입 변수를 의미한다.

    private T item;
    static T itme2; // static 멤버에 타입변수를 사용불가. static 멤버는 인스턴스 변수 참조 불가능 하기 때문
    ArrayList<T> list = new ArrayList<>();
    T[] tmpArr = new T[10]; // 지네릭 배열을 생성할 수 없는 건 new 연산자 때문이다. 컴파일 시점에 T가 뭔지 정확히 알아야 하는데, 클래스 컴파일 시점엔 T가 뭔지 알 수 없다.

    static <T extends Fruit> void test(T item) {}; // 제네릭 메소드, 앞 T와 뒤 T는 다르다

    public NewBox(T item) {
        this.item = item;
    }

    public NewBox() {

    }

    ArrayList<T> getList() {
        return list;
    }

    void add(T item) {
        list.add(item);
    }

    public T getItem() {
        return item;
    }
}
