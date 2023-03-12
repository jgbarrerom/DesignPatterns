package org.pattern.factory;

public abstract class Car {
    private String marca;
    private String peso;
    private String tipoCombustible;

    public void putWeals(){
        System.out.println("CON LLANTAS");
    }

    public void paint(){
        System.out.println("PINTADO");
    }

    public void putGas() {
        System.out.println("CON GASOLINA");
    }

    protected abstract void putDirection();
}
