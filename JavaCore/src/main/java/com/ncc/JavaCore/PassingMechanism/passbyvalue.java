package com.ncc.JavaCore.PassingMechanism;

public class passbyvalue {
    //    Biến tham trị: Khi truyền biến tham trị vào phương thức, giá trị của biến được sao chép và đưa vào phương thức.
//    Phương thức sẽ thao tác với một bản sao của biến đó, không ảnh hưởng đến giá trị của biến gốc. Khi phương thức kết thúc,
//    bản sao của biến được hủy và không có ảnh hưởng đến giá trị của biến gốc. Ví dụ:
    public static void main(String[] args) {
        int x = 10;
        addOne(x);
        System.out.println(x); // In ra 10

    }

    public static void addOne(int a) {
        a = a + 1;
    }
}
