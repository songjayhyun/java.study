package org.example.generic;

import java.util.List;
import java.util.stream.Collectors;

public class WildCardClass {

    static Apple makeApple(NewBox<Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) tmp += f + "";
        return new Apple(tmp);
    }

    static Apple makeApple(NewBox<Apple> box) { // 타입 변수만 다르다고 해서 오버로딩 안됨
        String tmp = "";
        for (Fruit f : box.getList()) tmp += f + "";
        return new Apple(tmp);
    }

    static Apple makeApple1(NewBox<? extends Fruit> box) { // fruit와 그 자손
        return new Apple("");
    }

    static Apple makeApple2(NewBox<? super Fruit> box) { // fruit와 그 하손
        return new Apple("");
    }

    static Apple makeApple3(NewBox<?> box) { // 다 가능
        return new Apple("");
    }
}
