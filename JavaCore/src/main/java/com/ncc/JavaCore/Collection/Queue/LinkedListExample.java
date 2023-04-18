package com.ncc.JavaCore.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);
        System.out.println("Queue :" + numbers);

        int accessnumber = numbers.peek();
        System.out.println("Truy cập phần tử:" + accessnumber);

        int removeNumber = numbers.poll();
        System.out.println("loại bỏ phần tử+ " + removeNumber);

        System.out.println("Cập nhật Queue:" + numbers);


    }
}
