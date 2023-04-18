package com.ncc.JavaCore.OverrideAndOverLoadding.Overriding;

public class Dog extends Animal{
//    Trong lập trình hướng đối tượng, từ khóa super được
//    sử dụng để truy cập các thành phần của lớp cha từ một lớp con.
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("the dog barks");
    }
}
