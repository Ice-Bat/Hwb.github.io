package com.hwb.extend_;

import com.hwb.extend_.improve.TopBase;

public class Base extends TopBase{
    public int n1 = 10;
    protected int n2 = 20;
    int n3 = 30;
    private int n4 = 40;

    public Base(){
        System.out.println("Base的无参构造器");
    }
    public Base(String name){
        System.out.println("Base的(String name)构造器");
    }


    public void test1() {
        System.out.println("n1 = " + n1);
    }

    protected void test2() {
        System.out.println("n2 = " + n2);
    }

    void test3() {
        System.out.println("n3 = " + n3);
    }

    private void test4() {
        System.out.println("n4 = " + n4);
    }
    public int getN4(){
        return n4;
    }
}
