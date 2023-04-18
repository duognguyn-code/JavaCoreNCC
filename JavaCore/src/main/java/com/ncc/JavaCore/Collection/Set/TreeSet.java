package com.ncc.JavaCore.Collection.Set;

public class TreeSet {
    public static void main(String[] args) {
        //Khởi tạo TreeSet
        java.util.TreeSet<Integer> set = new java.util.TreeSet<>();
        //Thêm phần tử vào set
        set.add(5);
        set.add(1);
        set.add(7);
        set.add(3);

        System.out.println(set);

        set.add(3);//Thêm phần tử trùng lặp
        System.out.println(set);

        //Xóa phần tử
        set.remove(7);
        System.out.println(set);
        System.out.println("Sắp xếp theo thứ tự giảm dần: " + set.descendingSet());
    }
//     Các phần tử trong TreeSet được sắp xếp theo thứ tự tăng dần,
//     nhưng chúng ta có thể thay đổi cách sắp xếp theo thứ tự giảm dần bằng phương thức TreeSet.descendingSet().
}
