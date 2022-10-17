package com.hwb.ploy_.polyparameter;

public class ployparameter {
    public static void main(String[] args) {
        Worker kk = new Worker("kk", 4000);
        Manner cc = new Manner("cc", 7000, 10000);
        System.out.println(kk.getAnnual());
        System.out.println(cc.getAnnual());
        Test test = new Test();
        test.testWork(kk);
        test.testWork(cc);
    }
}
