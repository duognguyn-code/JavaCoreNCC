package com.ncc.JavaCore.Abstract;

public class Circle extends Shape{
    private float radius;


    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
