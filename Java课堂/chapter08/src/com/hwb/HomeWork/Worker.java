package com.hwb.HomeWork;

public class Worker extends Employee{
    public Worker(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void printlnSal() {
        System.out.print("工人");
        super.printlnSal();
    }
}
