package com.ncc.JavaCore.Collection.CollectionStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5), Arrays.asList(6, 7, 8, 9));
        List<Integer> flattenedNumbers = nestedNumbers.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flattenedNumbers); // output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
