package org.pattern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void test_car() {
        Car walesCar = new BritishCarFactory().create();
        System.out.println("=======================================================");
        Car americanCar = new AmericanCarFactory().create();
    }

}