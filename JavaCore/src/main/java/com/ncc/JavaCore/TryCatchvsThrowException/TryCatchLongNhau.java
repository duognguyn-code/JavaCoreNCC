package com.ncc.JavaCore.TryCatchvsThrowException;

public class TryCatchLongNhau {
    public static void main(String args[]) {
        try {
            try {
                System.out.println("Thuc hien phep chia");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Lỗi phép chia: " + e.getMessage() );
            }

            try {
                int a[] = new int[5];
                a[5] = 4;//lỗi try cập phần tử ngoài mảng
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

            System.out.println("khoi lenh khac");
        } catch (Exception e) {
            System.out.println("xy ly ngoai le");
        }

        System.out.println("tiep tuc chuong trinh..");
    }
}
