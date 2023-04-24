package com.ncc.JavaCore.Abstract;

public class Rectangle extends Figure{
    private float length, width;


    @Override
    public float getArea() {
        return length * width;
    }


    @Override
    protected int GetData() {
        return 0;
    }

    @Override
    void dosomething() {

    }


}
