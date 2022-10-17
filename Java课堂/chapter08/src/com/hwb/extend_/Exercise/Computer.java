package com.hwb.extend_.Exercise;

public class Computer {

    private String cpu = "AMD";
    private double memory = 16;
    private String Hdd = "512固态硬盘";

    public Computer(String cpu,double memory,String Hdd){
        this.cpu = cpu;
        this.memory = memory;
        this.Hdd = Hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public String getHdd() {
        return Hdd;
    }

    public void setHdd(String hdd) {
        Hdd = hdd;
    }

    public String getDetails(){
        return "cpu = "+cpu + "内存 = " + memory + "硬盘 = " + Hdd;
    }
}
