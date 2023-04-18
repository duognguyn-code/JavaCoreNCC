package com.ncc.JavaCore.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer_lambda {
//    Consumer Lambda: Consumer là một kiểu đối tượng chứa một hàm có một tham số và không trả về giá trị nào.
//    Consumer được sử dụng để thực hiện một tác vụ trên một đối tượng.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer<Integer> printNumber = n -> System.out.println(n);
        numbers.forEach(printNumber);
    }
}
