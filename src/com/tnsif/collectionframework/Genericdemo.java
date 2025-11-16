package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

// demo for generic concepts
public class Genericdemo {
    public static void main(String[] args) {

        ArrayList<String> lis = new ArrayList<String>();

        // lis.add(4);  // not allowed because list is <String>

        lis.add("rashmi");
        lis.add("kusuma");
        lis.add("sushma");
        lis.add("apple");
        lis.add("banana");

        System.out.println(lis);

        // Traversing list through Iterator (Generic)
        Iterator<String> itr = lis.iterator();

        while (itr.hasNext()) { 
            System.out.println(itr.next()); 
        }
    }
}
