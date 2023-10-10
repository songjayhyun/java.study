package org.example.abstractandinterface.unit;

public class RepairableTest {

    public static void main(String[] args) {
        Tank tank = new Tank();
        SCV scv = new SCV();

        scv.repair(tank);
    }
}
