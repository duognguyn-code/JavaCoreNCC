package com.ncc.JavaCore.OverrideAndOverLoadding.Overloading;

public class Calculator {
//    Overloading (nạp chồng) là khi một lớp có nhiều phương thức cùng tên nhưng khác nhau về
//    tham số hoặc kiểu dữ liệu đầu vào. Khi một phương thức được gọi, trình biên dịch sẽ phân biệt
//    các phương thức theo số lượng và kiểu của các tham số đầu vào.
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    Calculator calculator = new Calculator();
    int sum1 = calculator.add(2, 3);      // sử dụng phương thức add(int a, int b)
    int sum2 = calculator.add(2, 3, 4);   // sử dụng phương thức add(int a, int b, int c)
}
