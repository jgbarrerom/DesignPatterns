package org.pattern.abstractfactory;

import org.junit.jupiter.api.Test;
import org.pattern.abstractfactory.factories.ComputerFactory;
import org.pattern.abstractfactory.factories.PCFactory;
import org.pattern.abstractfactory.factories.ServerFactory;

public class TestAbstractFactory {

    @Test
    public void testAbstractFac(){
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
