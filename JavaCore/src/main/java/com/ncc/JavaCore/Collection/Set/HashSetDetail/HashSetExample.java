package com.ncc.JavaCore.Collection.Set.HashSetDetail;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Random random = new Random();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            hashSet.add(random.nextInt(10000000));
        }

        long end = System.currentTimeMillis();
        System.out.println("Time to add elements to HashSet: " + (end - start) + " ms");

        start = System.currentTimeMillis();

        for (Integer num : hashSet) {
            // Do nothing
        }

        end = System.currentTimeMillis();
        System.out.println("Time to access elements in HashSet: " + (end - start) + " ms");
    }
}




