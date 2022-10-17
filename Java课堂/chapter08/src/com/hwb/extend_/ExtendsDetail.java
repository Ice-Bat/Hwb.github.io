package com.hwb.extend_;

public class ExtendsDetail {
    public static void main(String[] args) {
        //2.当创建子类对象时，不管使用子类的哪个构造器
        //默认情况下都会调用父类的无参构造器
        //如果父类没有无参构造器
        //则必须在子类的构造器中用super去指定
        //使用使用父类的哪个构造器完成对父类初始化
        //否则编译不会通过
        //java所有类都是Object的子类，Object是所有类的父类
        //父类的构造器不限于父类，将一直往上追溯到Object父类
        //9.子类最多只能继承一个父类（单继承机制
        //10.不能滥用继承 子类和父类要满足is-a的关系
        Sub sub = new Sub();
        System.out.println("=====");
        Sub sub2 = new Sub("tom");
    }
}
