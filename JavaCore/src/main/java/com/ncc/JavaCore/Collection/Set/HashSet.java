package com.ncc.JavaCore.Collection.Set;

import java.util.Set;
//import java.util.HashSet;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.HashSet<>();
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(7);
        System.out.println(set);

        //Thêm phần tử trùng lặp
        set.add(3);
        System.out.println(set);

        //Xóa phần tử 7
        set.remove(7);
        System.out.println("Set sau khi loại bỏ phần tử: " + set);

    }
}

