package com.hwb.HomeWork;

public class Staff {
    private String name;
    private double salary;
    private double day;
    private double grade;

    public Staff(String name, double salary, double day, double grade) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void println(){
        System.out.println(getName()+"工资"+salary*day*grade);
    }
}
