package com.tnsif.collectionframework;

import java.util.LinkedHashSet;

// Demo for LinkedHashSet
public class Linkedlistsetdemo {
    public static void main(String[] args) {

        LinkedHashSet<String> s = new LinkedHashSet<>();

        s.add("cherry");
        s.add("banana");
        s.add("orange");
        s.add("cherry");  // duplicate - ignored
        s.add("papaya");
        s.add("cherry");  // duplicate - ignored
        s.add(null);      // allowed once
        s.add(null);      // duplicate - ignored

        System.out.println("LinkedHashSet: " + s);
    }
}
