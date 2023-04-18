package com.ncc.JavaCore.Collection.Map;
import java.util.TreeMap;
public class TreeMapExample {
//    là class thực thi giao diện Map Interface với dạng cây đỏ đen (Red-Black tree) trong
//    đó các key đã được sắp xếp. Class này cho phép thời gian thêm, sửa, xóa và tìm kiếm 1
//    phần tử trong Map là tương đương nhau và đều là O(log(n))
    public static void main(String[] args) {
        // Khởi tạo một đối tượng TreeMap mới với kiểu key là String và value là Integer
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

        // Thêm các phần tử vào TreeMap
        treeMap.put("John", 23);
        treeMap.put("Anna", 27);
        treeMap.put("Peter", 30);
        treeMap.put("Mary", 25);

        // Hiển thị TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Lấy giá trị tương ứng với key "John"
        int age = treeMap.get("John");
        System.out.println("Age of John: " + age);

        // Xóa phần tử có key "Mary"
        treeMap.remove("Mary");

        // Hiển thị TreeMap sau khi xóa phần tử
        System.out.println("TreeMap after removing Mary: " + treeMap);

        // Lấy key đầu tiên của TreeMap
        String firstKey = treeMap.firstKey();
        System.out.println("First key: " + firstKey);

        // Lấy key lớn hơn hoặc bằng "Peter"
        String higherKey = treeMap.ceilingKey("Peter");
        System.out.println("Higher key than Peter: " + higherKey);
    }
}
