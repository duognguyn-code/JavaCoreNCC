package com.ncc.JavaCore.TryCatchvsThrowException;

public class ThrowExample {
    public void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = a / b;
        System.out.println(result);
    }
//    từ khóa throw được sử dụng để ném một ngoại lệ (exception) cụ thể ra khỏi phương thức (method) hoặc khối lệnh (block). Khi chúng ta sử dụng throw,
//    chúng ta sẽ tạo ra một đối tượng ngoại lệ và ném nó ra để báo hiệu rằng đã xảy ra một trường hợp đặc biệt trong chương trình.
}
