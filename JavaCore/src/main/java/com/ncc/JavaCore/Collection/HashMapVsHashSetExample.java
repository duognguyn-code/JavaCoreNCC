package com.ncc.JavaCore.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class HashMapVsHashSetExample {
//    Cơ chế của hai cái
    public static void main(String[] args) {
        int min = 1000000;
        int max = 10000000;
        int[] sizes = {min, 2 * min, 5 * min, max};

        for (int size : sizes) {
            System.out.println("Testing size " + size);

            // Create a HashMap and add random values to it
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            Random random = new Random();
            long startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                int key = random.nextInt();
                int value = random.nextInt();
                hashMap.put(key, value);
            }
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("HashMap add: " + duration + " ns");

            // truy cập phần tử random trong hashmap
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                int key = random.nextInt();
                hashMap.get(key);
            }
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("HashMap access: " + duration + " ns");

            // Create a HashSet and add random values to it
            HashSet<Integer> hashSet = new HashSet<>();
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                int value = random.nextInt();
                hashSet.add(value);
            }
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("HashSet add: " + duration + " ns");

            // truy cập phần tử trong hashset
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                int value = random.nextInt();
                hashSet.contains(value);
            }
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("HashSet access: " + duration + " ns");
        }
    }
}
