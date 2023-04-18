package com.ncc.JavaCore.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(random.nextInt(10000000));
        }

        long end = System.currentTimeMillis();
        System.out.println("Time to add elements to ArrayList: " + (end - start) + " ms");

        start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            int num = arrayList.get(i);
        }

        end = System.currentTimeMillis();
        System.out.println("Time to access elements in ArrayList: " + (end - start) + " ms");
    }
    HashMapExample hd= new HashMapExample();
}
