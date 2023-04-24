package com.ncc.JavaCore.Enum.List;

import java.util.Iterator;
import java.util.List;


public class ArrayList {
    public static void main(String[] args) throws Exception {
        List<String> listAnimal = new java.util.ArrayList<String>();
        listAnimal.add("Dog");
        listAnimal.add("Cat");
        listAnimal.add("Mouse");

        listAnimal.add(0, "Bear");

        System.out.println("Danh sach dong vat");
        for (int i = 0; i < listAnimal.size(); i++) {
            System.out.println(listAnimal.get(i));
        }
        //Su dung foreach
        System.out.println("Su dung for each:");
        for (String animal : listAnimal) {
            System.out.println(animal);
        }
        //Sử dụng Iterator
        System.out.println("Sử dụng iterator");
        Iterator<String> itr = listAnimal.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
