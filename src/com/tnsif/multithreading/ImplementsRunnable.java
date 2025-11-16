package com.tnsif.multithreading;

// Implementing Runnable interface
class Eclipse1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Eclipse thread id: " + Thread.currentThread().getId());
        }
    }
}

public class ImplementsRunnable {
    public static void main(String[] args) {
        Eclipse1 e = new Eclipse1();
        Thread t = new Thread(e);
        t.start();

        System.out.println("Main method id: " + Thread.currentThread().getId());
    }
}
