package org.pattern.factory;

public class BritishCarFactory extends CarFactory {
    @Override
    protected Car createCar() {
        return new CarRightControl();
    }
}
