package com.rd.Operators;

public class decrementClass {

	public static void main(String[] args) {
	
		decrementClass.postDecrement();
	}
	
	public static void postDecrement() {
		int a=10;
		System.out.println(a);
		int b= a--;
		System.out.println(b);
		System.out.println(a);
	}

}
