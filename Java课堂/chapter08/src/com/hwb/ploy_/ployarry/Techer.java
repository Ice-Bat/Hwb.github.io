package com.hwb.ploy_.ployarry;

public class Techer extends Person {
    private int salary;

    public Techer(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + "薪水" + salary;
    }

    public void teach() {
        System.out.println("老师" + getName() + "正在教java课");
    }
}
