package com.ncc.JavaCore.IntegerPool;

public class integerPoolExample {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        Integer i3 = 128;
        Integer i4 = 128;
        // Integer.cache lưu trữ bộ nhớ đệm (cache) các giá trị Integer.
       // Như bạn thấy giá, mặc định giá trị high = 127, low = -128, nên các giá trị được cache trong khoảng từ -128 đến 127.

        Integer i5 = new Integer(127);// tạo 1 đối tượng có kiểu Interger mới
        Integer i6 = new Integer(127);// tạo 1 đối tượng có kiểu Interger mới

        int i7 = 127;

        System.out.println(i1 == i2); // = true// so sánh địa chỉ bộ nhớ

        System.out.println(i3 == i4); // = false
        System.out.println(i5 == i6); // = false
        System.out.println(i1 == i5); // = false
        System.out.println(i1 == i7); // = true
    }
}
