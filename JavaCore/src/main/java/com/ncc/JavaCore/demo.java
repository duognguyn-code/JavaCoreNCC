package com.ncc.JavaCore;

public class demo {
    public static void main(String[] args) {
//        String a = "a";
//        a = a + "b";
//        System.out.println(a);

       final Student stu = new Student("Long1");
        Student stu1 = new Student("Long12");
//        stu = stu1; lỗi do không thể gán biến stu với đối tượng stu1
        ChangerSTD(stu);
        System.out.println(stu.getName());
        System.out.println(stu1.getName());


    }
    public static void ChangerSTD(Student st){
        st.setName("Longcanh");
    }

}
