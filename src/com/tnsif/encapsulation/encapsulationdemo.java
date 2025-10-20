package com.tnsif.encapsulation;
// demo for encapsulation
public class encapsulationdemo {
	
	int serialnumber;  //data members
	String name;
	int age;
	
	void show() { // member function
		System.out.println(serialnumber +" "+name+" "+age);
	}
	public static void main(String[] args) {
		encapsulationdemo d=new encapsulationdemo ();
	        d.serialnumber=1;
	        d.name="rashmi";
	        d.age=25;
	        
	        d.show();
	}

}



