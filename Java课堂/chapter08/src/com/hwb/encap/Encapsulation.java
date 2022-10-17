package com.hwb.encap;

import java.util.Scanner;

public class Encapsulation {
    /*
    写一个小程序com.hwb.encap：Encapsulation
    不能随便查看人的年龄，工资隐私，并对设置的年龄进行合理的验证。年龄合理就设置
    否则就给默认，年龄必须在1-120间，年龄，工资不能直接查看，
    name的长度在2-6字符间
     */
    public static void main(String[] args) {
        //如果需要使用快捷键alt + r 运行，需要先配置主类
        //第一次用鼠标点击形式运算程序，后面就可以用快捷键
        Person person = new Person();
        person.setName("zzdd");
        person.setAge(30);
        person.setSalary(299999);
        person.Info();
        System.out.println("请输入您老婆的生日");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        System.out.println(person.getSalary(key));
        Person sb = new Person("sb", 333, 33333);
        sb.Info();
    }

}

class Person {
    public String name; //名字公开
    private int age;  //年龄私有
    private double salary;  //..
    //自己写getXxx 和 setXxx太慢了
    //使用快捷键 alt + g -> Gettrr and Setter

    //加一个构造器看看

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        //如果我们直接在外部调用构造器就可以绕过setXxx 和 getXxx
        //所以
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("请输入一个2-6字符的名字，不然就为默认名");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("请输入1-120间的年龄，不然就为默认值");
            this.age = 18;
        }

    }

    public double getSalary(int key) {
        //可以增加对当前对象的权限判断
        if (key == 667788) {
            return salary;
        } else {
            System.out.println("你无权查看");
        }
        return 0;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public void Info() {
        System.out.println("信息为:" + "name= " + name + " age=" + age);
    }
}
