package com.ncc.JavaCore.Collection.Set;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.LinkedHashSet<>();
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(8);
        System.out.println(set);

        set.add(8);
        System.out.println(set);

        set.remove(8);
        System.out.println(set);
//         khi các phần tử được thêm vào thì thứ tự sẽ không bị thay đổi.
//         Việc thêm phần tử trùng lặp cũng không sảy ra trong LinkedHashSet
    }
}
