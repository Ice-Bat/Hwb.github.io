package com.hwb.HomeWork;

public class Peasant extends Employee{
    public Peasant(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void printlnSal() {
        System.out.print("农民");
        super.printlnSal();
    }
}
