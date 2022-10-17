package com.hwb.object;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person("cc", 45, '男');
        Person person1 = new Person("cc", 45, '男');
        System.out.println(person == person1);
        System.out.println(person.equals(person1));

//        if(person.getName().equals(person1.getName())&&person.getAge()== person1.getAge()&&person.getGender() == person1.getGender()){
//            System.out.println("true");
//        }

    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //重写object的equals的方法
    public boolean equals(Object obj){
        if(this == obj){  //如果比较的对象是同一个对象
            return true;
        }
        if(obj instanceof Person){  //如果是同一个类
            Person p = (Person)obj;  //向下转型，因为我们需要obj的各个属性
            return this.name.equals(p.name)&&this.age==p.age&&this.gender==p.gender;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
