package com.ncc.JavaCore.MutablevsImmutable;

public class immutableClassExample {
    private final String name;
    private final int age;

    public immutableClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//    Khai báo lớp và định nghĩa tất cả các trường là private và final. Điều này đảm bảo rằng trường của lớp không thể bị thay đổi sau khi được khởi tạo.
//    Khai báo một constructor, có thể là một constructor mặc định hoặc một constructor chứa tham số, để khởi tạo tất cả các trường của lớp.
//    Chỉ khai báo các phương thức getter để truy cập các trường của lớp.
}
