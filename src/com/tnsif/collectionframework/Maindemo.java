package com.tnsif.collectionframework;

public class Maindemo {

    private String name;
    private int age;

    public Maindemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Getter methods (needed by Comparators)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
