package com.tnsif.collectionframework;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // (Your earlier text removed – because it was causing error)

    // Comparable method → sort by age
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
