package com.hwb.HomeWork;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        Person person[] = new Person[3];
        person[0] = new Person("aa",98,"worker");
        person[1] = new Person("bb",98,"manger");
        person[2] = new Person("cc",98,"doctor");
        Person temp;
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length-1-i; j++) {
                if(person[i].getAge() < person[i+1].getAge()){
                    temp = person[i];
                    person[i]= person[i+1];
                    person[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
