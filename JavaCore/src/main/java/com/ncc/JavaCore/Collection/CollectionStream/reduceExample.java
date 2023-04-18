package com.ncc.JavaCore.Collection.CollectionStream;

import java.util.Arrays;
import java.util.List;

public class reduceExample {
//    + reduce(): Kết hợp các phần tử trong Collection thành một giá trị duy nhất bằng cách áp dụng một phép toán nhất định.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum); // output: 15
    }
}
