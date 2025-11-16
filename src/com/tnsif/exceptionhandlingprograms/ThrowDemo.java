package com.tnsif.exceptionhandlingprograms;

// demo for throw keyword
public class ThrowDemo {

    void validate(int age) {
        if(age < 18) {
            throw new ArithmeticException("you are not eligible");
        } else {
            System.out.println("you are eligible");
        }
    }

    public static void main(String[] args) {
        ThrowDemo t = new ThrowDemo();
        t.validate(9);
    }
}
