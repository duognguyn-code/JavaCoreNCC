package com.ncc.JavaCore.Interface;

public interface SecondInterface {
    void secondMethod();

    default void log(String str){
        System.out.println("This method is default implementation" + str);
    }

    static boolean isNull(String string) {
        System.out.println("Interface Null Check");

        return string == null ? true : "".equals(string) ? true : false;
    }
}
