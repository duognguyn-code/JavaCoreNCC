package com.ncc.JavaCore.Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        Random random = new Random();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            hashMap.put(i, random.nextInt(10000000));
        }

        long end = System.currentTimeMillis();
        System.out.println("Time to add elements to HashMap: " + (end - start) + " ms");

        start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            int num = hashMap.get(i);
        }

        end = System.currentTimeMillis();
        System.out.println("Time to access elements in HashMap: " + (end - start) + " ms");
    }
}
