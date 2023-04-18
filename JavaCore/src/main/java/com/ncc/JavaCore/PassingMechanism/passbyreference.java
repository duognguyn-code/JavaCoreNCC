package com.ncc.JavaCore.PassingMechanism;

public class passbyreference {
//    Biến tham chiếu: Khi truyền biến tham chiếu vào phương thức, tham chiếu đến đối tượng được sao chép và đưa vào phương thức.
//    Phương thức sẽ thao tác với cùng một đối tượng mà tham chiếu trỏ tới, và thay đổi trực tiếp giá trị của đối tượng đó.
//    Khi phương thức kết thúc, đối tượng đó vẫn được giữ lại và có thể ảnh hưởng đến giá trị của biến gốc. Ví dụ:

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        addWorld(s);
        System.out.println(s); // In ra "Hello World"
    }

    public static void addWorld(StringBuilder str) {
        str.append(" World");
    }
}
