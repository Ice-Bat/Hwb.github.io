package com.hwb.ploy_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //使用多态机制可以统一的管理主人喂食的问题
    //animal 的编译对象时Animal，可以指向Animal的子类对象
    //food 的编译对象时Food，可以指向Food的子类对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给" + animal + "喂" + food);
    }
//    public void feed(Dog dog, Meat meat) {
//        System.out.println("主人" + name + "给" + dog.getName() + "喂" + meat.getName());
//    }
//
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人" + name + "给" + cat.getName() + "喂" + fish.getName());
//    }
}
