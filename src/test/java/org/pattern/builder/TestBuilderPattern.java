package org.pattern.builder;

import org.junit.jupiter.api.Test;

public class TestBuilderPattern {

    @Test
    public void testBuilderPattern(){
        Computer cp = new Computer.ComputerBuilder("486GB","22.3GB")
                .setBluetoothEnabled(true)
                //.setGraphicsCardEnabled(true)
                .build();
        System.out.println(cp);
    }
}
