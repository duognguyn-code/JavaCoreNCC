package com.ncc.JavaCore.Enum.List;

import java.util.Iterator;
import java.util.List;


public class Vector {
    public static void main(String[] args) {
        List<String> animal = new java.util.Vector<>();
        animal.add("Dog");  //Thêm phần tử vào vector
        animal.add("Cat");
        animal.add("Bear");
        animal.add("Cat");

        animal.add(1, "Fish"); //Thêm phần tử vào index được chỉ định

        System.out.println("Kích thước của vector: " + animal.size());
        System.out.println("animal.contains(\"Bear\"): "+animal.contains("Bear"));
        System.out.println("animal.indexOf(\"Cat\"): " +animal.indexOf("Cat"));
        System.out.println("animal.lastIndexOf(\"Cat\"): " + animal.lastIndexOf("Cat"));

        //Sử dụng foreach
        for (String str: animal) {
            System.out.println(str);
        }

        //Sử dụng iterator
        Iterator<String> itr = animal.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
