package com.ncc.JavaCore.TryCatchvsThrowException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchResourceExampe {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }

        }catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
//    Với try-catch-resources, không cần phải đóng tài nguyên thủ công bằng cách gọi
//    phương thức close() trực tiếp, do đó giảm thiểu các lỗi liên quan đến việc quên đóng tài nguyên.
}
