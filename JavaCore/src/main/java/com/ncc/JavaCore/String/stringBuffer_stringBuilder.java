package com.ncc.JavaCore.String;

public class stringBuffer_stringBuilder {
    //    Cả hai lớp đều cung cấp các phương thức để thêm, sửa, xóa các ký tự hoặc chuỗi con trong một chuỗi hiện có.
//    Sự khác biệt chính giữa StringBuilder và StringBuffer là sự đồng bộ hóa. StringBuffer là một lớp đồng bộ hóa,
//    có nghĩa là các phương thức của nó được đảm bảo sẽ không bị xung đột khi nhiều luồng đồng thời cố gắng truy cập nó. Tuy nhiên,
//    điều này đôi khi làm giảm hiệu suất của nó. Trong khi đó, StringBuilder không đồng bộ hóa, nên nó được sử dụng cho các trường
//    hợp không cần phải xử lý đồng thời.
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world"); // thêm chuỗi " world" vào cuối sb
        System.out.println(sb.toString()); // kết quả là "Hello world"

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" world"); // thêm chuỗi " world" vào cuối sbf
        System.out.println(sbf.toString()); // kết quả là "Hello world"
    }
}
