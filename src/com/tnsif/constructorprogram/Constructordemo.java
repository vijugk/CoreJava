package com.tnsif.constructorprogram;

import java.util.Scanner;

public class Constructordemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the address");
		String address=sc.next();
		
		System.out.println("enter the id");
		int cid=sc.nextInt();
		
		Constructordemo c=new Constructordemo();
		
		c.setConstructorname(name);
		c.setConstructoradress(address);
		c.setConstructorid(cid);
		
		System.out.println(c);
		
	}

	private void setConstructorid(int cid) {
		// TODO Auto-generated method stub
		
	}

	private void setConstructoradress(String address) {
		// TODO Auto-generated method stub
		
	}

	private void setConstructorname(String name) {
		// TODO Auto-generated method stub
		
	}
}
