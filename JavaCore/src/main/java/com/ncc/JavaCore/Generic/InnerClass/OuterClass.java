package com.ncc.JavaCore.Generic.InnerClass;

public class OuterClass {
//    là một lớp được khai báo trong một lớp khác và nó có thể truy cập vào thành phần private của lớp bao bọc. Inner class có thể đưojc sử dụng để
//triển khai các hành vi cụ thể của một lớp bao bọc, hoặc để giới hạn phạm vi truy cập của các lớp khác vào lớp bao bọc,Inner class có thể là một member class, local
//class hoặc anonymous class(Lớp vô danh)
    private int x = 10;

    class InnerClass {
        public void display() {
            System.out.println("The value of x is " + x);
        }
    }
    public void createInnerClass() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerClass();
    }
}
