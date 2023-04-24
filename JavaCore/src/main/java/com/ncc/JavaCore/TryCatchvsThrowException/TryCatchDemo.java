package com.ncc.JavaCore.TryCatchvsThrowException;

public class TryCatchDemo {
    public static void main(String[] args) {

        //Xử lý ngoại lệ bằng try catch trong Java
        try {
            int data = 5 / 0;
        } catch (ArithmeticException e) {
            //Lớp này được sử dụng để đại diện cho các ngoại
            // zlệ xảy ra trong quá trình thực hiện các phép tính số học.
            //In ra màn hình tên ngoại lệ
            System.out.println(e);
        }
        System.out.println("Phép chia cho 0");
    }
}
