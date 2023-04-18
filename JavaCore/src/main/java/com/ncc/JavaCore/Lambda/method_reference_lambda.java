package com.ncc.JavaCore.Lambda;

import java.util.Arrays;
import java.util.List;

public class method_reference_lambda {
    //    Method Reference là một cách rút gọn của lambda expression để
//    gọi một phương thức đã tồn tại. Method Reference được sử dụng khi một lambda expression chỉ gọi một phương thức duy nhất.
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.forEach(System.out::println); // in ra từng tên trên một dòng
    }
}
