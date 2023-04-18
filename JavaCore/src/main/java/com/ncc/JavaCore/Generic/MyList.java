package com.ncc.JavaCore.Generic;

public class MyList<T>{
    private T[] elements;
    private int size;
    public MyList(){
        elements = (T[]) new Object[10];
        size = 0;
    }
    public void add(T element){
        elements[size] =element;
        size++;
    }
    public T get(int index){
        return elements[index];
    }
}
