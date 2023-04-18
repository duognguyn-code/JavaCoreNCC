package com.ncc.JavaCore.Collection.CollectionStream;

import java.util.Arrays;
import java.util.List;

public class forEachExample {
//    + forEach(): Thực hiện một tác vụ trên từng phần tử trong Collection.
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        names.stream()
                .forEach(System.out::println);
    }
}
