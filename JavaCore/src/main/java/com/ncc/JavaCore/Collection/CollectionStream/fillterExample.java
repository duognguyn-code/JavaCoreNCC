package com.ncc.JavaCore.Collection.CollectionStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class fillterExample {
    //    filter(): Lọc các phần tử thỏa mãn điều kiện được xác định bởi một Predicate.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 6, 3, 8, 5, 9, 2);
        List<Integer> result = numbers.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());
        System.out.println(result); // output: [6, 8, 9]
    }
}
