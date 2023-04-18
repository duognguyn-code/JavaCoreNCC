package com.ncc.JavaCore.MutablevsImmutable;

import java.util.ArrayList;
import java.util.List;

public class mutableExample {
//    Mutable(thay đổi được) là tính chất của đối tượng có thể thay đổi giá trị của nó sau khi được tạo ra.
//Ví dụ: các đối tượng kiểu List, Set hoặc Map là các đối tượng mutable trong Java.  các phép thêm, sửa hoặc xóa các phần tử cần phải được thực hiện trên đối tượng đó.
//Khi cần tối ưu hiệu suất và sử dụng bộ nhớ. Trong nhiều trường hợp, việc sử dụng các đối tượng mutable có thể giúp giảm thiểu số lượng bộ nhớ cần thiết cho
// chương trình và tăng tốc độ xử lý(đảm bảo tính toàn vẹn của dữ liệu và tránh xảy ra các lỗi không mong muốn)
    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>();
        ((ArrayList<String>) mutableList).add("heloo");
        ((ArrayList<String>) mutableList).add("WWolrddd");
        System.out.println(mutableList);

        mutableList.remove(0); // loại bỏ phần tử "world" khỏi danh sách
        System.out.println(mutableList); // in ra [Hello]
    }


}
