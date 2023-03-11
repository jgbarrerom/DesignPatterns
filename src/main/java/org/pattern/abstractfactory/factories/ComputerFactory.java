package org.pattern.abstractfactory.factories;

import org.pattern.abstractfactory.Computer;
import org.pattern.abstractfactory.ComputerAbstractFactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
