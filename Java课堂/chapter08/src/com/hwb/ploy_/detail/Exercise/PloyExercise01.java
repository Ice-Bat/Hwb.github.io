package com.hwb.ploy_.detail.Exercise;

public class PloyExercise01 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.count);
        sub.show();
        Base base = sub;
        System.out.println(base == sub);
        System.out.println(base.count);
        base.show();
    }
}
