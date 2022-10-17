package com.hwb.extend_.Super;

public class B extends A{
    public int n1 = 10;

    public B(){
        //默认存在super();
        System.out.println("B类无参构造器");
    }

    public void b(){
        System.out.println("B类b方法");
        //若此时调用父类A中a方法和属性
        //则一共有如下3种
        //（1）a();（2）this.a();（3）super.a();
        //查找方法顺序是：
        //（1）首先查找本类是否有该方法，如果有，则调用
        //（2）若果没有，则查找父类一直到Object，最后都没有就报错
        //（3）如果有，并且可以访问的话（即不是private）就调用
        //（4）如果是private的话就cannot access，并且如果后面有没带private的话也报错
        a();
        this.a();
        super.a();//super直接跳过子类查找父类

        System.out.println(n1);
        System.out.println(super.n1);
    }

}
