package com.hwb.HomeWork;

public class HomeWork04 {
    public static void main(String[] args) {
        Staff manager = new Manager("小李", 300, 24, 1.2);
        Staff simpleStaff = new SimpleStaff("小欢", 200, 30,1.0);
        manager.println();
        simpleStaff.println();
    }
}
