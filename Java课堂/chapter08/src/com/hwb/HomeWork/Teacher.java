package com.hwb.HomeWork;

public class Teacher extends Employee {
    private double lessonPay;
    private double lessonDay;

    public Teacher(String name, int age, double salary, double lessonPay) {
        super(name, age, salary);
        this.lessonPay = lessonPay;
    }

    @Override
    public void printlnSal() {
        System.out.print("老师");
        System.out.println(getName()+"工作了"+getMonth()+"个月工资为"+(getMonth()*getSalary()+getLesson()*getLessonPay()));
    }

    public double getLessonPay() {
        return lessonPay;
    }

    public void setLessonPay(double lessonPay) {
        this.lessonPay = lessonPay;
    }

    public double getLesson() {
        return lessonDay;
    }

    public void setLesson(double lessonDay) {
        this.lessonDay = lessonDay;
    }
}
