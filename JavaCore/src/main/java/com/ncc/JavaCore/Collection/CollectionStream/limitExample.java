package com.ncc.JavaCore.Collection.CollectionStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class limitExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(result); // output: [1, 2, 3]
    }
}
