package org.example.abstractandinterface;

interface I {
    void play();
}

class A {
    void autoPlay(I i) {
        i.play();
    }
}

class B implements I{
    @Override
    public void play() {
        System.out.println("B.play");
    }
}

public class InterfaceTest {

    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B()); // B.play
    }
}
