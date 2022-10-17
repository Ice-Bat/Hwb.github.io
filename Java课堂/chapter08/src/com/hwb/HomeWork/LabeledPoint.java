package com.hwb.HomeWork;

public class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(double xCoordinate, double yCoordinate, String label) {
        super(xCoordinate, yCoordinate);
        this.label = label;
    }
}
