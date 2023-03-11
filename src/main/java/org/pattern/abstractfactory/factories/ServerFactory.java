package org.pattern.abstractfactory.factories;

import org.pattern.abstractfactory.Computer;
import org.pattern.abstractfactory.ComputerAbstractFactory;
import org.pattern.abstractfactory.elements.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String cpu;
    private String hdd;

    public ServerFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,cpu,hdd);
    }
}
