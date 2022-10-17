package com.hwb.ploy_.objploy;

public class PloyObject {
    public static void main(String[] args) {
        //体验多态
        //animal 的编译类型就是 Animal  运行类型就是 Dog
        Animal animal = new Dog();
        //运行到该行时，animal的运行类型就是Dog，所以cry就是Dog的Cry
        //如若 DOg中没有cry，就执行编译类型中的cry
        animal.cry();
        //animal 的编译类型就是 Animal  运行类型就是 Cat
        animal = new Cat();
    }
}
