package com.hwb.HomeWork;

public class Waiter extends Employee{
    public Waiter(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void printlnSal() {
        System.out.print("服务员");
        super.printlnSal();
    }
}
