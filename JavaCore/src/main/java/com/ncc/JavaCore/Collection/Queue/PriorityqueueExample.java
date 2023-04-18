package com.ncc.JavaCore.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityqueueExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(9);
        System.out.println("Queue" + numbers);

        // Truy cập phần tử trong Queue
        int accessedNumber = numbers.peek();
        System.out.println("Truy cập phần tử: " + accessedNumber);

        // Loại bỏ phần tử trong Queue
        int removedNumber = numbers.poll();
        System.out.println("Loại bỏ phần tử: " + removedNumber);

        System.out.println("Cập nhật Queue: " + numbers);
    }
}
