package com.tnsif.accessmodiferdemo;
// demo  for access modifier

public class accessdemo {

	 // public 
	
public 	int a=9;
public String s="guru";

public void display() {
	System.out.println("welcome to java");	
}

public static void main(String[] args) {
	accessdemo obj=new accessdemo();
	System.out.println(obj.a);
	System.out.println(obj.s);
	
	obj.display();
	
}
}