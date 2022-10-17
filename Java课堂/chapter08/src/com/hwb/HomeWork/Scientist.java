package com.hwb.HomeWork;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public void printlnSal() {
        System.out.print("科学家");
        System.out.println(getName()+"工作了"+getMonth()+"个月工资为"+(getMonth()*getSalary()+bonus));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
