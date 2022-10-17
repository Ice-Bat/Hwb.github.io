package com.hwb.extend_;

public class Sub extends Base {
    //子类必须调用父类的构造器，完成初始化
    //默认调用无参构造器，
    //如果希望调用父类的那个构造器就显式定义super(参数列表)
    //super只能放在构造器第一行使用(也只能放在构造器中使用)
    //super()和this()只能放在第一行使用
    //super()可以访问父类this()只能访问本类
    public Sub(){
        super("ff");
        //this("cc");

        System.out.println("Sub的无参构造器");
    }
    public Sub(String name){
        super("tom");
        System.out.println("Sub的(String name)构造器");
    }

    public void sayOK() {//子类方法
        //非私有的属性和方法可以直接在子类中访问
        //但是私有的属性和方法不可以直接在子类子类中访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test1();
        test2();
        test3();
        //调用私类需要通过父类的公共类访问

    }
}
