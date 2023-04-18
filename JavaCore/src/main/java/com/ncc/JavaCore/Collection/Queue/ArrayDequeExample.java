package com.ncc.JavaCore.Collection.Queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    //    ArrayDeque trong Java để thao tác với một deque (một danh sách hai đầu cho phép thêm, xóa, lấy phần tử từ cả hai đầu).
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("John");
        deque.add("Jack");
        deque.add("Sam");
        deque.add("Anna");

        // Hiển thị deque
        System.out.println("Deque: " + deque);

        // Thêm phần tử vào đầu deque
        deque.addFirst("Tom");

        // Thêm phần tử vào cuối deque
        deque.addLast("Jerry");

        // Hiển thị deque
        System.out.println("Deque after adding elements at both ends: " + deque);

        // Xóa phần tử đầu tiên của deque
        deque.removeFirst();

        // Xóa phần tử cuối cùng của deque
        deque.removeLast();

        // Hiển thị deque sau khi xóa phần tử
        System.out.println("Deque after removing elements from both ends: " + deque);

        // Lấy phần tử từ đầu deque
        String firstElement = deque.getFirst();
        System.out.println("First element of deque: " + firstElement);

        // Lấy phần tử từ cuối deque
        String lastElement = deque.getLast();
        System.out.println("Last element of deque: " + lastElement);
    }
}
