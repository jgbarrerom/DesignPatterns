package org.pattern.factory;

public class CarLeftControl extends Car{
    @Override
    protected void putDirection() {
        System.out.println("volante a la izquierda");
    }
}
