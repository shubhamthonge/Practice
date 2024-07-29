package com.tech;

public class odd {

	public static void main(String[] args) {
     
		int [] a= {1,2,3,4,6,5,7,10,8,9};
		int sum=0;
		
		for(int ad:a) {
			if(ad %2==0) {
				sum+=ad;
			}
		}
		System.out.println("sum of even = "+sum);
	}
}
