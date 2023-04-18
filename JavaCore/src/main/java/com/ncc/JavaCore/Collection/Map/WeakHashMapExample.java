package com.ncc.JavaCore.Collection.Map;
import java.util.Map;
import java.util.WeakHashMap;
public class WeakHashMapExample {
    public static void main(String[] args) {
        Map<Object, Object> weakHashMap = new WeakHashMap<>();

        // Tạo một đối tượng key
        Object key = new Object();

        // Thêm key và value vào WeakHashMap
        weakHashMap.put(key, "Value associated with key");

        // Hiển thị WeakHashMap
        System.out.println("WeakHashMap: " + weakHashMap);

        // Giải phóng đối tượng key
        key = null;

        // Khởi chạy bộ thu gom rác của JVM để thu gom các key không được sử dụng
        System.gc();

        // Chờ 1 giây để cho bộ thu gom rác hoạt động
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Hiển thị WeakHashMap sau khi các key không được sử dụng đã được thu gom
        System.out.println("WeakHashMap after GC: " + weakHashMap);


    }
}
