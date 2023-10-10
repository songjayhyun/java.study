package org.example.abstractandinterface.lift;

// 인터페이스에 의존한다

public class Factory extends Building implements Liftable{

    LiftableImpl l  = new LiftableImpl();

    @Override
    public void liftOff() {
        l.liftOff();
    }

    @Override
    public void move(int x, int y) {
        l.move(x,y);
    }

    @Override
    public void stop() {
        l.stop();
    }

    @Override
    public void land() {
        l.land();
    }
}
