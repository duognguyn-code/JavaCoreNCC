package com.ncc.JavaCore.Collection.List;

public class Stack {
    //Ngăn xếp (stack) là một cấu trúc dữ liệu tuyến tính, hoạt động theo cơ chế LIFO (Last In First Out),
    // tạm dịch là “vào sau ra trước”
    //Lớp Stack kế thừa từ lớp Vector nên sẽ kế thừa tất cả các phương thức của Vector.
    // Ngoài ra, Stack còn có các phương thức của riêng Stack là:
    public static void main(String[] args) {
        java.util.Stack<String> animals= new java.util.Stack<>();
        //Thêm phần tử vào Stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
        animals.pop();
        System.out.println("Stack: " + animals);
    }
}
