package com.hwb.object;

public class ToSting {
    public static void main(String[] args) {
        Monster monster = new Monster("cc",34,5678);
        System.out.println(monster.toString());
        /*
            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        (1)getClass().getName() 返回类的全类名(包名+类名)
        (2)Integer.toHexString(hashCode()) 返回HashCode的十六进制
         */
        System.out.println("==当输出一个方法是，toString默认会被调用==");
        System.out.println(monster);
    }
}

class Monster{
    private String name;
    private int age;
    private int sal;

    public Monster(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    //toString的重写

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }
}
