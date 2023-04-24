//package com.ncc.JavaCore.Collection.Set.HashSetDetail;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class HashSetExample2 {
//    private static class student {
//        public int id;
//        public String name;
//
//        public student(int id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return "{" + id + ": " + name + "}";
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            student  other = (student)obj;
//            return this.id ==  other.id && this.name.equals(other.name);
////            return false;
////            return true;
//        }
//
//        @Override
//        public int hashCode() {
//            return (this.name + "-" + this.id).hashCode();
//        }
//    }
//
//    public static void main(String[] args) {
//        Set<student> mySet = new HashSet<>();
//        student s1 = new student(123, name);
//
//
//
////        s1.s
////        Intern intern = new Intern("name", "age");
////
////        hashMap.put(1, intern);
////
////        intern.setName("name2");
////
////        hashMap.get(1) ?
//        student s2 = new student(345, "Cảnh");
//        student s3 = new student(123, "Long");
//        student s4 = new student(367, "Trần");
//
//        mySet.add(s1);
//        mySet.add(s3);
//        mySet.add(s2);
//        mySet.add(s4);
//////
//        System.out.println("s1 == s3: "+ (s1==s3));
//        System.out.println("s1.equals3: " + (s1.equals(s3)));
//////
//        for (student st : mySet) {
//            System.out.println(st);
//        }
//
////        System.out.println("Hash value cuar s1 khi chua goi hash code:" + (s1.hashCode()));
////        System.out.println("Hash value cua s3 chua goi hash code:" + (s3.hashCode()));
//
//        System.out.println("Hash value cuar s1 sau khi  goi hash code:" + (s1.hashCode()));
//        System.out.println("Hash value cua s3 sau khi  goi hash code:" + (s3.hashCode()));
////Sau khi dufng hashcode thi khong cos cap nao turn gdc in ra
//    }
//
//}
