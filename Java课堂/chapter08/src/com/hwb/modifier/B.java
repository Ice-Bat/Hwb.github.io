package com.hwb.modifier;

public class B {
    public void m2(){
        A a = new A();
        a.m1();
        a.m3();
        a.m2();
        //在同一个包下，可以访问public，protected，默认修饰属性和方法，不能访问private
        System.out.println("n1=" + a.n1 + "n2=" + a.n2 + "n3=" + a.n3);
    }
}
