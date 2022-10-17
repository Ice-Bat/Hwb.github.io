package com.hwb.object;

import com.sun.org.apache.xpath.internal.operations.String;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person01 person01 = new Person01();
        Person01 person02 = new Person01();
        System.out.println(person01.name==person02.name);
        System.out.println(person01.equals(person02));
        System.out.println(person01.name.equals(person02.name));

    }
}
class Person01{
    public String name;
}
