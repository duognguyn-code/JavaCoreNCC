package com.ncc.JavaCore.Lambda;

import java.util.function.Function;

public class function_lambda {
    //Function là một kiểu đối tượng chứa một hàm có một tham số và trả về một giá trị.
    // Function được sử dụng để chuyển đổi một đối tượng thành một đối tượng khác.
    public static void main(String[] args) {
//        Function<Integer, String> inToString = n -> String.valueOf(n);
//        String str = inToString.apply(123);
//        System.out.println(str); // "123"
        String s1 = "a";
        String s2 = "a";
        String s3 = "a" + "a";
        String s4 = s1 + s2;
        System.out.println(s3 == s4);
    }

}
