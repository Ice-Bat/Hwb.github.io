package com.hwb.HomeWork.HomeWork13;

import com.hwb.HomeWork.Peasant;
import com.hwb.HomeWork.Techer;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class HomeWork13 {
    public static void main(String[] args) {
        Student student = new Student("小明", "男", 15, "20210030998");
        student.printInfo();
        System.out.println("--------------------------------");
        Teacher teacher = new Teacher("张三", "男", 34, 4);
        teacher.printInfo();
        HomeWork13 homeWork13 = new HomeWork13();

        Person arr[] = new Person[4];
        arr[0] = new Student("小张", "男", 23, "343432");
        arr[1] = new Student("小刘", "女", 21, "313432");
        arr[2] = new Teacher("小黄", "女", 67, 24);
        arr[3] = new Teacher("小西", "男", 54, 14);
        Person temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getAge() < arr[j + 1].getAge()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k].toString());
        }
        System.out.println("=====排序后====");
        for (int l = 0; l < arr.length; l++) {
            homeWork13.test(arr[l]);
        }
    }

    public void test(Person person) {
        if (person instanceof Student) {
            ((Student) person).study();
        } else if(person instanceof Teacher){
            ((Teacher) person).teach();
        } else{
            System.out.println("nothing");
        }
    }

}
