package com.ncc.JavaCore.Interface;

public class MyClass implements FirstInterface, SecondInterface{
    @Override
    public void firstMethod(String string) {

    }

    @Override
    public void log(String string) {
        FirstInterface.super.log(string);
    }

    @Override
    public void secondMethod() {

    }

    public static void main(String[] args) {
        MoveInterface mv= new MoveInterface() ;
        mv.run123456();
        MoveInterface.myStaticMethod();
    }
}
