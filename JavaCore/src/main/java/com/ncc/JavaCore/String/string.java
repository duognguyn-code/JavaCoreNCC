package com.ncc.JavaCore.String;

public class string {
    public static void main(String[] args) {
        String myString = "Hello world!";
        int length = myString.length(); // trả về độ dài của chuỗi, tức là 12
        char firstChar = myString.charAt(0); // trả về ký tự đầu tiên của chuỗi, tức là 'H'
        String subString = myString.substring(6); // trả về chuỗi con bắt đầu từ vị trí thứ 6, tức là "world!"
        int index = myString.indexOf("world"); // trả về vị trí đầu tiên của chuỗi "world" trong chuỗi myString, tức là 6
    }

}
