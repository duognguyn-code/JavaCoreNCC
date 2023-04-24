package com.ncc.JavaCore.Collection.Map.HashMap;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
public class HashMapActiveExample {
    public static void main(String[] args) {
        HashMap<Integer, Intern> hashmap = new HashMap<>();
        Intern intern = new Intern("name", 2);
        hashmap.put(1, intern);
        intern.setName("name2");

        System.out.println(hashmap.get(1).getName());

//  khi mà hashmap chỉ dùng integer và
        return;
        //Tạo mới một HashMap bao gồm Key(String) và Value(String)
//        HashMap<String, String> hashmap = new HashMap<>();
//        //Thêm Entry(K-V) vào hashmap(key:K) là String và kiểu dữ liệu của giá trị (value:V) cũng là String.
//        hashmap.put("Hardware", "gvh");
//        hashmap.put("Software", "Phần mềm");
//        hashmap.put("College", "Trường Đại Học");
//        hashmap.put("Programer", "Lập Trình Viên");
//        hashmap.put("Compile", "Biên Dịch");
//        hashmap.put("Error", "Lỗi");
//
//        System.out.println("has");
//        //Tạo một Set lưu các EntrySet của HashMap
//        Set<Map.Entry<String, String>> setHashMap = hashmap.entrySet();
//        //Sử dụng một vòng lặp for để iterator qua toàn bộ Entry vừa được lưu vào Set
//        for (Map.Entry<String,String> i:setHashMap){
//            System.out.println(i.getKey()+"   -->   "+i.getValue());
//        }
//        System.out.println("In ra toàn bộ key");
//        //In toàn bộ key ra màn hình
//        for (String i:hashmap.keySet()){
//            System.out.println(i);
//        }
//
//        System.out.println("In ra toàn bộ value");
//        //In toàn bộ giá trị ra màn hình
//        for (String i:hashmap.values()){
//            System.out.println(i);
//        }
//        System.out.println("In ra value với key = Error");
//        //Lấy giá trị tương ứng với khóa "Error"
//        System.out.println(hashmap.get("Error"));
//
////Tạo mới một HashMap bao gồm Key(Integer) và Value(Float)
//        HashMap<Integer, Float> hashMap1 = new HashMap<>();
//
////Tạo mới một HashMap bao gồm Key(String) và Value(Double), có kích thước bằng 10
//        HashMap<String, Double> hashMap2 = new HashMap<>(10);
//
////Khai báo 1 HashMap được tạo thành từ 1 Collection khác
//        HashMap<Float, Integer> hashMap4 = new HashMap<>(new TreeMap<>());
////        void clear() :  	Xóa tất cả các phần tử của HashMap.
////        Object clone():   Trả về một bản copy của HashMap.
////        boolean containsKey(Object key) : Kiểm tra nếu HashMap chứa một phần tử có khóa được chỉ định.
////        boolean containsValue(Object value): Kiểm tra nếu HashMap chứa một phần tử có giá trị được chỉ định.
////        boolean isEmpty():  	Kiểm tra HashMap trống hay không.
////        void putAll(Map t): Sao chép các phần tử của Map vào HashMap.
////        int size():  	Trả về số phần tử đang tồn tại bên trong HashMap.

    }

}
class Intern {
    String name;
    int age;

    public Intern(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}