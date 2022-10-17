package com.hwb.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        //要按照查找关系来返回信息
        //1.首先看子类是否有该属性，如果有就直接访问，并返回属性
        //2.如果子类没有该属性就看父类有没有父类有没有该属性（如果父类有，并且可以访问，就返回信息
        //3.如果没有就一直继续往上查找父类直到Object
        //
        System.out.println(son.name);//无头儿
        System.out.println(son.age);//33
        System.out.println(son.hobby);//打飞机
    }
}

    class GrandPa{
        String name = "大头爷";
        String hobby = "打飞机";
    }
    class Father extends GrandPa{
        String name = "小头爸";
        int age  = 33;
    }
    class Son extends Father{
        String name = "无头儿";
    }


