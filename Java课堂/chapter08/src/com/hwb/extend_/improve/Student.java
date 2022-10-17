package com.hwb.extend_.improve;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生" + name + "年龄" + age + "总成绩" + score);
    }
}
