//package 的作用是声明当前类所在的包，需要放在类（或文件）的最上面
//类中最多就只有一个 package

package com.hwb.pkg;

import java.util.Arrays;
import java.util.Scanner;

//import 指令 位置放在package下面，在类定义面前，可有有多句且没有顺序要求
public class PkgDetail {

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3, 4, 4, 7, 2};
        Scanner scanner = new Scanner(System.in);
        Arrays.sort(arr);
    }
}
