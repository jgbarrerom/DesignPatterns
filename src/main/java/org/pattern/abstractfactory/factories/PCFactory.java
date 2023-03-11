package org.pattern.abstractfactory.factories;

import org.pattern.abstractfactory.Computer;
import org.pattern.abstractfactory.ComputerAbstractFactory;
import org.pattern.abstractfactory.elements.PC;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String cpu;
    private String hdd;

    public PCFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram,cpu,hdd);
    }
}
