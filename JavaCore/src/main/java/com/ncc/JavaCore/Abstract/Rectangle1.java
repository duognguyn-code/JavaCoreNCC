package com.ncc.JavaCore.Abstract;

public class Rectangle1 extends Shape{
    private double length;
    private double width;

    public Rectangle1(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
