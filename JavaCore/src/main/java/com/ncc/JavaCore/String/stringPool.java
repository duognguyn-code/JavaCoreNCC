package com.ncc.JavaCore.String;

public class stringPool {
    public static void main(String[] args) {
        String s1 = "hello"; // Chuỗi này được tạo trong String pool
        String s2 = "hello"; // Chuỗi này sẽ được trỏ tới chuỗi đã có trong String pool
        String s5 = "he" + "llo";
        String s7 = "he";
//        String s8 = "llo";
        String s9 = s7 + "llo";

        String s3 = new String("hello"); // Chuỗi này được tạo ra trong heap, không phải trong String pool
        String s4 = new String("hello"); // Chuỗi này cũng được tạo ra trong heap, không phải trong String pool

        // So sánh s1 và s2
        if (s1 == s2) {
            System.out.println("s1 and s2 are the same object"); // In ra chuỗi này
        } else {
            System.out.println("s1 and s2 are different objects");
        }
        // So sánh s1 và s5
        if (s1 == s5) {
            System.out.println("s1 and s5 are the same object"); // In ra chuỗi này
        } else {
            System.out.println("s1 and s5 are different objects");
        }
        // So sánh s1 và s9
        if (s1 == s9) {
            System.out.println("s1 and s9 are the same object");
        } else {
            System.out.println("s1 and s9 are different objects");// In ra chuỗi này
        }


        // So sánh s1 và s3
        if (s1 == s3) {
            System.out.println("s1 and s3 are the same object");
        } else {
            System.out.println("s1 and s3 are different objects"); // In ra chuỗi này
        }

        // So sánh s3 và s4
        if (s3 == s4) {
            System.out.println("s3 and s4 are the same object");
        } else {
            System.out.println("s3 and s4 are different objects"); // In ra chuỗi này
        }
    }
}
