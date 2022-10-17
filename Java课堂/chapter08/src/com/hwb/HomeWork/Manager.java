package com.hwb.HomeWork;

public class Manager extends Staff{

    public Manager(String name, double salary, double day, double grade) {
        super(name, salary, day, grade);
    }

    @Override
    public void println() {
        System.out.println(getName()+"工资"+(1000+getSalary()*getDay()*getGrade()));
    }
}
