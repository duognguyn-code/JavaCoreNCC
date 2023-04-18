package com.ncc.JavaCore.MutablevsImmutable;

public class immutableExample {
//    Immutable (không thay đổi được) là tính chất của đối tượng không thể thay đổi giá trị của nó sau khi được tạo ra.
//    Khi một đối tượng immutable được tạo ra, giá trị của nó sẽ không thay đổi trong suốt quá trình chạy chương trình. Đối tượng immutable không cho phép
//    thay đổi trạng thái của nó và được sử dụng để đảm bảo tính toàn vẹn dữ liệu. Ví dụ, các đối tượng kiểu String là các đối tượng immutable trong Java.
    public static void main(String[] args) {
        String immutableString = "Hello, world";
        immutableString.replace("Hello, world","123");
        System.out.println(immutableString);// in ra Hello, world

        String newString = immutableString.replace("World","java");
        System.out.println(newString);// in ra Hello, Java
        System.out.println(immutableString);// in ra Hello, world

    }
//    Một class có thể gọi là immutable khi mà chỉ dùng getter
}
