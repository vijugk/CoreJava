package com.tnsif.collectionframework;

import java.util.ArrayList;

// demo for ArrayList
public class Arraylistdemo {
    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<>();

        System.out.println("Size of the array: " + al.size());

        al.add(2);
        al.add(3.6f);
        al.add("ramya");
        al.add('g');

        System.out.println(al);
        System.out.println("Size of the array: " + al.size());

        System.out.println(al.contains(6));   // false
        System.out.println(al.isEmpty());     // false
        System.out.println(al.indexOf(3));    // -1 (3 is not present)
        System.out.println(al.get(0));        // first element
        System.out.println(al.remove(3));     // removes element at index 3

        System.out.println(al);

        System.out.println(al.add(7));        // adds 7 and prints true
        System.out.println(al);               // final list
    }
}
