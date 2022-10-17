package com.hwb.ploy_.detail;

public class PloyDetail03 {
    public static void main(String[] args) {
        //instanceof 用于判断对象的运行类型是否为XX类型或XX类型的子类型
        AA aa = new BB();
        BB bb = new BB();
        System.out.println(aa instanceof AA);//运行类型位BB
        System.out.println(bb instanceof AA);

    }

}

class AA{}
class BB extends AA{}
