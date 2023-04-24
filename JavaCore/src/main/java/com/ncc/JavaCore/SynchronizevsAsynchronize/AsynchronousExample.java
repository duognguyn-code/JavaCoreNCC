package com.ncc.JavaCore.SynchronizevsAsynchronize;

public class AsynchronousExample {
    public static void main(String[] args) {
        System.out.println("Start");
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Hello");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        System.out.println("continue Active");
    }
}
