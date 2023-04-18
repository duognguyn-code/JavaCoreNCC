package com.ncc.JavaCore.Static;

public class methodStatic {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    static void change() {
        // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
        college = "Đại Học Công Nghệ";
    }

    methodStatic(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        methodStatic.change();

        methodStatic s1 = new methodStatic(111, "Thông");
        methodStatic s2 = new methodStatic(222, "Minh");
        methodStatic s3 = new methodStatic(333, "Anh");

        s1.display();
        s2.display();
        s3.display();
    }
}
