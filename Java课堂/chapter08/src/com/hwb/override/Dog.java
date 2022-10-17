package com.hwb.override;

public class Dog extends Animal {
    //1.子类方法的形参列表，方法名称要和父类的形参列表，方法名称一致
    public void m() {

    }

    //2.子类方法的返回类型和父类的返回类型相同，或者是父类返回类型的子类
    //比如父类返回类型 Object 和子类返回类型String
    public String m1() {
        return null;
    }

    //3.子类方法的访问权限不能缩小父类方法的访问权限
    //public->protected->默认->private
    void m2() {

    }
//    private void m2(){
//
//    }

}
