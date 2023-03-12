package org.pattern.factory;

public class CarRightControl extends Car {
    @Override
    protected void putDirection() {
        System.out.println("VOLANTE A LA DERECHA");
    }
}
