package com.ncc.JavaCore.Collection.Map;
import java.util.HashMap;
public class HashMapExample {
//    là class thực thi giao diện Map Interface với các key được
//    lưu trữ dưới dạng bảng băm, cho phép tìm kiếm nhanh O(1).
    public static void main(String[] args) {
        // Khởi tạo một đối tượng HashMap mới với kiểu key là String và value là Integer
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        // Thêm các phần tử vào HashMap
        hashMap.put("John", 23);
        hashMap.put("Anna", 27);
        hashMap.put("Peter", 30);
        hashMap.put("Mary", 25);

        // Hiển thị HashMap
        System.out.println("HashMap: " + hashMap);

        // Lấy giá trị tương ứng với key "John"
        int age = hashMap.get("John");
        System.out.println("Age of John: " + age);

        // Xóa phần tử có key "Mary"
        hashMap.remove("Mary");

        // Hiển thị HashMap sau khi xóa phần tử
        System.out.println("HashMap after removing Mary: " + hashMap);

        // Lấy keySet của HashMap và hiển thị các key
        System.out.println("Keys of HashMap: " + hashMap.keySet());

        // Lấy collection của các value và hiển thị các value
        System.out.println("Values of HashMap: " + hashMap.values());
    }
}
