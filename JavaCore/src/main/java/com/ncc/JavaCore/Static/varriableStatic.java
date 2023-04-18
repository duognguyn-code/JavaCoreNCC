package com.ncc.JavaCore.Static;

public class varriableStatic {
//    Khi bạn khai báo một biến là static, thì biến đó được gọi là biến tĩnh, hay biến static.
    int rollno;
    String name;
    static String college = "Bưu chính viễm thông";
    varriableStatic(int r, String n){
        rollno = r;
        name = n;
    }
//    Nếu chúng ta tạo nó là static, thì trường này sẽ chỉ sử dụng bộ nhớ một lần để lưu biến này.
    void display(){
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String[] args) {
        varriableStatic s1= new varriableStatic(111,"thông");
        varriableStatic s2= new varriableStatic(222,"minhg");
        s1.display();
        s2.display();
    }
}
