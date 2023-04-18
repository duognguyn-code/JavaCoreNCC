package com.ncc.JavaCore.Static;

public class classStatic {
//    Một class được có thể được đặt là static chỉ khi nó là một nested class (tức nằm trong một lớp khác).
//    Một nested static class có thể được truy cập mà không cần một object của outer class (lớp bên ngoài).
    private String subject;

    classStatic (String subject) {
        this.subject = subject;
    }

    // nested static class
    static class MyWebsite {
        public static String WEBSITE = "gpcoder.com";
    }

    public void print() {
        System.out.println("Subject = " + subject);
        System.out.println("Website = " + MyWebsite.WEBSITE);
    }

    public static void main(String[] args) {
        classStatic ex1 = new classStatic("Core Java");
        ex1.print();
    }
}
