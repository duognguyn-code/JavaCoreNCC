package com.ncc.JavaCore.FunctionalInterface;

@FunctionalInterface
public interface DemoFunctionalInterface {
//    Một Functional Interface hợp lệ chỉ có duy nhất một method trừu tượng.Một Functional Interface hợp lệ chỉ có duy nhất một method trừu tượng.
//    Một Functional Interface có thể có các phương thức của lớp java.lang.Object.
    void doSomeThing();

    default void defaultMethod1() {

    }

    default void defaultMethod2() {

    }

    static void staticMethod() {

    }
    int hashCode();

    String toString();

    boolean equals(Object obj);
//    https://viblo.asia/p/khac-nhau-giua-abstract-class-va-interface-khi-nao-dung-chung-ORNZq9YrZ0n
}
