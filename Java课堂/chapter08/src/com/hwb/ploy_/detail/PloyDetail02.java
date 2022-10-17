package com.hwb.ploy_.detail;

public class PloyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说，属性的值看编译类型

        Base base = new Sub(); //向上转型
        System.out.println(base.count); //10
        Sub sub = (Sub) base;  //向下转型
        System.out.println(sub.count);  //20
    }
}
