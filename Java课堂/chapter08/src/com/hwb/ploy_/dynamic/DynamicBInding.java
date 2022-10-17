package com.hwb.ploy_.dynamic;

public class DynamicBInding {
    public static void main(String[] args) {
        A a = new B();
        //动态绑定机制
        //当调用对象方法时，该方法会和该对象的内存地址/动态类型绑定
        //当调用属性时，没有动态绑定机制，哪里声明，哪里使用
        System.out.println(a.sum());  //40->30
        System.out.println(a.sum1());  //30->20

    }
}
