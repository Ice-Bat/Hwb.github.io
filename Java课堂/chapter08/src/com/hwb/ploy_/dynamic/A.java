package com.hwb.ploy_.dynamic;

public class A {
    public int i = 10;
    public int sum(){
        return getI() + 10;
    }
    public int getI(){
        return i;
    }
    public int sum1(){
        return i + 10;
    }
}
