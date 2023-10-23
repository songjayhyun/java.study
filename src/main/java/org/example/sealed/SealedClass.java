package org.example.sealed;

public sealed interface SealedClass<T> permits Cons, Empty{
    // sealed는 class나 interface로 만들어야 하고, 하위 타입을 의무적으로 가짐
    // permit은 허용하는 타입을 지정하며, 하위 타입이 존재해야함
    // sealed와 permits은 세트이다

    // sealed 하위 타입은 final, seaeld(permits필수), non-sealed로 지정해야함
    // 또한, 같은 패키지 또는 같은 모듈에 위치해야함
    // 같은 파일 내에 있다면 permit 생략 가능
}
