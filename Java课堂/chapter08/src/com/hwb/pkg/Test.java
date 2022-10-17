package com.hwb.pkg;

import com.hwb.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下，可以访问public修饰的属性和方法
        a.m1();
        System.out.println("n1="+a.n1);

    }
}
