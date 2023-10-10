package org.example.abstractandinterface.unit;

public class SCV extends GroundUnit implements Repairable {

    // Repairable타입인 r은 인터페이스에 정의된 멤버로만 사용 가능

    void repair (Repairable r) {
        if (r instanceof GroundUnit groundUnit) {
            groundUnit.move();
        }
    }

    // 리턴 타입이 인터페이스라는 것은 구현체를 리턴하겠다는 뜻이다.
    Repairable myself() {
        return new SCV();
    }
}
