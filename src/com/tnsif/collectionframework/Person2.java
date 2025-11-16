package com.tnsif.collectionframework;
// demo for comparable interface

public class Person2 implements Comparable <Person2>{
 String name;
 int age;
 
 Person2(String name,int age){
	 this.name=name;
	 this.age=age;
 }
 void displayinfo() {
	 System.out.println("name "+name );
 }
 
 // sort by name
@Override
public int compareTo(Person2 o) {
	// TODO Auto-generated method stub
	return this.name.compareTo(o.name);
}
}
