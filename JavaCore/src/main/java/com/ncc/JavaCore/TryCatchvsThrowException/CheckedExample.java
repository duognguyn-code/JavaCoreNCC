package com.ncc.JavaCore.TryCatchvsThrowException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExample {
//    public static void main(String[] args) {
//        BufferedReader fileInput = null;
//        FileReader file = new FileReader("C:\\test\\a.txt");
//        fileInput = new BufferedReader(file);
//
//        // Print first 3 lines of file "C:\test\a.txt"
//        for (int counter = 0; counter < 3; counter++)
//            System.out.println(fileInput.readLine());
//
//        fileInput.close();
//    }
//    Output
//    Exception in thread “main” java.lang.RuntimeException: Uncompilable source code – unreported exception java.io.FileNotFoundException;
//    must be caught or declared to be thrown at Main.main(Main.java:5)

    public static void main(String[] args){
        try {
            File file = new File("duong.txt");
            Scanner scanner = new Scanner(file);
        }catch (IOException e){
            System.out.println(e.getMessage());// có thể dùng e.toString(), e.
        }

    }
//    public void readFromFile(String fileName) throws IOException {
////Chúng ta chỉ cần throws IOException vì nó đã bao gồm FileNotFoundException.
//        File file = new File(fileName);
//        Scanner scanner = new Scanner(file);
//        // ...
//    }
//   phương thức sẽ đọc dữ liệu từ một tệp tin được khai báo có tên là filename
//    tuy nhiên bạn sẽ phải bắt exception nếu không tìm thấy file(FileNotFoundException) thông qua từ khóa throws
}
