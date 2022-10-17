package com.hwb.ploy_.polyparameter;

public class Test {
    public double showEmpAnnual(Employee e){
        return e.getAnnual();
    }
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        } else if(e instanceof Manner){
            ((Manner) e).manage();
        } else {
            System.out.println("无效处理");
        }
    }
}
