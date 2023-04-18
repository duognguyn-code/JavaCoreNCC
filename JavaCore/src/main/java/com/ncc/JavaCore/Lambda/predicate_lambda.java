package com.ncc.JavaCore.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class predicate_lambda {
    //    Predicate: là một lambda function, chấp nhân đầu vào là một đối tượng và trả về một giá trị boolean.
//    Predicate được  sử dụng để kiểm tra một điều kiện và trả về true hoặc false
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> inEven = n -> n % 2 == 0;
        List<Integer> envenNumbers = numbers.stream().filter(inEven).collect(Collectors.toList());
        System.out.println(envenNumbers); //[2, 4, 6, 8]

    }
}
