package com.tnsif.exceptionhandlingprograms;

// with exception
public class WithException {
    public static void main(String[] args) {

        System.out.println("java");

        int d = 5;  // fixed: not zero
        System.out.println("welcome");

        try {
            int a = 55 / d;  // no exception now
            System.out.println("Result = " + a);
        }
        catch (Exception e) {
            System.out.println("caught " + e);
        }

        System.out.println("hello");
    }
}
