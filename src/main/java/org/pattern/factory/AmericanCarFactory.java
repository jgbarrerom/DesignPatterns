package org.pattern.factory;

public class AmericanCarFactory extends CarFactory{
    @Override
    protected Car createCar() {
        return new CarLeftControl();
    }
}
