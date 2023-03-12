package org.pattern.factory;

public abstract class CarFactory {

    public Car create(){
        Car yellowCar = createCar();

        yellowCar.paint();
        yellowCar.putWeals();
        yellowCar.putGas();
        yellowCar.putDirection();
        return yellowCar;
    }
    protected abstract Car createCar();
}
