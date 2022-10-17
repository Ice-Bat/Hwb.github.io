package com.hwb.ploy_.polyparameter;

public class Manner extends Employee {
    private double bonus;

    public Manner(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理" + getName() + "正在监工");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + getBonus();
    }
}
