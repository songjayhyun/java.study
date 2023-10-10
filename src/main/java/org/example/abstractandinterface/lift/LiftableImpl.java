package org.example.abstractandinterface.lift;

public class LiftableImpl implements Liftable{
    @Override
    public void liftOff() {
        System.out.println("LiftableImpl.liftOff");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("LiftableImpl.move");
    }

    @Override
    public void stop() {
        System.out.println("LiftableImpl.stop");
    }

    @Override
    public void land() {
        System.out.println("LiftableImpl.land");
    }

}
