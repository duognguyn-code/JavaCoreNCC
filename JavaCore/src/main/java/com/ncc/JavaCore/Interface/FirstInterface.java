package com.ncc.JavaCore.Interface;

public interface FirstInterface {
    void firstMethod(String string);

//     Tính năng này sẽ giúp chúng ta mở rộng các phương thức bổ sung phát sinh sau này mà không ảnh hưởng đến các class liên quan
    default void log(String string){
        System.out.println("This method is default implementation" + string);
    }
}
