package com.hwb.extend_;

public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("小学生" + name +"正在考试。");
    }
    public void showInfo(){
        System.out.println("学生"+ name +"年龄"+ age+"总成绩"+score);
    }

}
