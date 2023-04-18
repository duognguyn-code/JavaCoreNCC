package com.ncc.JavaCore.NestedStaticClass;

public class OuterClass {

//    là một lớp tĩnh được khai báo trong một lớp khác trong một lớp khác và nó không thể truy cập vào các thành phần non-static của lớp bao bọc
//.Nested static class dùng để các nhóm các lớp tĩnh có liên quan đến nhau và không cần truy cập vào các thành phần non-static của lớp bao bọc
    private static int x = 11;

    static class NestedStaticClass {
        public void display() {
            System.out.println("The value of x is " + x);
        }
    }
    public static void main(String[] args) {
        OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass();
        nested.display();
    }
}
