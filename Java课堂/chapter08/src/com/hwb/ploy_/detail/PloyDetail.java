package com.hwb.ploy_.detail;

public class PloyDetail {
    public static void main(String[] args) {

        //向上转型 ：父类的引用指向子类的对象
        //语法  父类类型 引用名 = new 子类对象();
        Animal animal = new Cat();
        Object obj = new Cat();

        //向上转型的调用规则
        //可以调用父类中的所有类，（但需遵循访问权限
        //但是不能调用子类的特有类
        //因为在编译阶段，能调用那些成员，只有编译类型来决定的
        //最终运行效果看子类（运行类型）的具体实现，即调用方法时，从子类（运行类型）开始查找

        animal.eat();
        animal.cry();
        animal.run();
        //animal.eatMouse();错误

        //向下转型：
        //（1）语法 子类类型 引用名 = (子类类型) 父类引用
        Cat cat = (Cat) animal;  //编译类型和运行类型居委Cat
        cat.eatMouse();
        //只能强转父类的引用，不能强转父类的对象
        //要求父类的引用必须指向的是当前目标类型的对象
        //Dog dog = (Dog) animal;   错误
    }
}
