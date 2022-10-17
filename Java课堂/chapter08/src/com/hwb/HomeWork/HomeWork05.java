package com.hwb.HomeWork;

public class HomeWork05 {
    public static void main(String[] args) {
        Worker worker = new Worker("黄东",45,5000);
        worker.setMonth(10);
        worker.printlnSal();
        Peasant peasant = new Peasant("箫莲", 65, 3000);
        peasant.setMonth(12);
        peasant.printlnSal();
        Waiter waiter = new Waiter("刘牛", 45, 6000);
        waiter.setMonth(9);
        waiter.printlnSal();
        Teacher teacher = new Teacher("周牛", 47, 4000, 90);
        teacher.setMonth(9);
        teacher.setLessonPay(300);
        teacher.printlnSal();
        Scientist scientist = new Scientist("钟南山", 79, 10000, 300000);
        scientist.setMonth(10);
        scientist.printlnSal();
    }
}