package com.hwb.extend_.Exercise;

public class Exercise01 {
    /*
    编写Compter类，包含cpu，内存，硬盘等属性，getDetail方法用于返回cpu信息HDD
    编写pc子类继承cpu父类，添加特有属性（品牌brand
    编写NotePad子类继承Computer ，添加特有属性（color
    编写Exercise01类，在main中创建Pc和NotePad对象，分别给对象中特有的属性赋值
    以及从Computer继承中的属性赋值，并使用方法打印
     */
    public static void main(String[] args) {
        Pc pc = new Pc("AMD", 16, "512固态硬盘","Lenovo");
        pc.printInfo();
        NotePad notePad = new NotePad("AMD", 16, "512固态硬盘","银色");
        notePad.printInfo();
    }
}


