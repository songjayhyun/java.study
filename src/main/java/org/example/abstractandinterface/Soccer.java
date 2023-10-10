package org.example.abstractandinterface;

// 다중 상속은 불가능, 다중 인터페이스 상속은 가능

public class Soccer extends Sports implements IBehavior{

    @Override
    public void play() {
        System.out.println("Soccer.play");
    }
}
