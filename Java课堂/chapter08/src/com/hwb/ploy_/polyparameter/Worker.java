package com.hwb.ploy_.polyparameter;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("工人" + getName() + "正在干活");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
