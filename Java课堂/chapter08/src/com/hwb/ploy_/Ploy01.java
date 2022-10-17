package com.hwb.ploy_;

public class Ploy01 {
    public static void main(String[] args) {
        Master master = new Master("箫");
        Dog dog = new Dog("xx");
        Meat meat = new Meat("rou");
        master.feed(dog,meat);
        Cat cat = new Cat("jj");
        Fish fish = new Fish("yu");
        master.feed(cat,fish);

        Animal animal = new Cat("ff");
        Food food = new Fish("gg");
        master.feed(animal,food);
    }
}
