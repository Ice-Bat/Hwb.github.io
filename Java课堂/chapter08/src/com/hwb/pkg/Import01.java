package com.hwb.pkg;
//建议用到哪个类，就导入哪个类，不建议使用.*
//import java.util.Scanner;//表示只将java.util包下的Scanner引入
//import java.util.*;//表示将java.util 包下的所有类都引入

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        //使用系统给的Arrays完成数组排序
        int arr[] = {2,4,1,7,89,45,23};
        //对数组进行排序
        //传统方法是，自己编排
        //但可以调用系统提供的相关类
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
