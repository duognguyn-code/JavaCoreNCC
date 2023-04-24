package com.ncc.JavaCore.TryCatchvsThrowException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryCatchFinallyExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
//    chúng ta phải mở tài nguyên trong khối try, sau đó đóng tài nguyên trong khối finally. Điều này có thể dẫn đến việc mã lệnh lặp lại,
//    khó hiểu và dễ gây lỗi nếu quản lý tài nguyên không được thực hiện chính xác.
}
