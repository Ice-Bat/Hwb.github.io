package com.hwb.extend_.Exercise;

public class Pc extends Computer{

    private String brand;

    public Pc(String cpu, double memory, String Hdd, String brand) {
        super(cpu, memory, Hdd);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("Pc信息如下");
        System.out.println(getDetails() + "brand = " + brand);
    }
}
