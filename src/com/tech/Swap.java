package com.tech;

public class Swap {
 
	public static void main(String[] args) {
		 
		int a=11;
		int b=33;
	
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a^b;//44
		b=a^b;//11
		a=a^b;//33
	
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
}
