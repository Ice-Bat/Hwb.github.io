package com.hwb.extend_.improve;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.age = 10;
        pupil.name = "ccd";
        pupil.setScore(90);
        pupil.testing();
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.age = 23;
        graduate.name = "ddd";
        graduate.setScore(80);
        graduate.testing();
        graduate.showInfo();
    }
}
