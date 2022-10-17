package com.hwb.object;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        System.out.println(a == b);
        B bobj = a;
        System.out.println(bobj == a);
        "Hello".equals("aba");

        /*
        //JDK的源码，String 类的 equals方法
        //把Object的equals方法重写，变成了比较两个字符串
        //
        public boolean equals(Object anObject) {
        if (this == anObject) { //如果是同一个对象
            return true;
        }
        if (anObject instanceof String) { //如果时同一个类或子类
            String anotherString = (String)anObject;//向下转型
            int n = value.length;
            if (n == anotherString.value.length) {//长度
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
         */

        //Object的equals
        /*
        public boolean equals(Object obj) {
            return (this == obj); //判断对象是否相同
        }

         */
    }
}

class A extends B{}
class B {}
