package com.ncc.JavaCore.TryCatchvsThrowException;

public class Throw {
    public void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = a / b;
        System.out.println(result);
    }
}
