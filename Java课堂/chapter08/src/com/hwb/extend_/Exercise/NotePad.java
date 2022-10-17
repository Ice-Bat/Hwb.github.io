package com.hwb.extend_.Exercise;

public class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, double memory, String Hdd, String color) {
        super(cpu, memory, Hdd);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Pc信息如下");
        System.out.println(getDetails() + "color = " + color);
    }
}
