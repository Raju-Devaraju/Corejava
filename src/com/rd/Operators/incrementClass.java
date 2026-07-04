package com.rd.Operators;

public class incrementClass {

	public static void main(String[] args) {
		
		incrementClass ic=new incrementClass();
		ic.preIncrement();

	}
	
	public void postIncrement() {
		int a=10;
		System.out.println(a);
		int b=a++;
		System.out.println(b);
		System.out.println(a);
		System.out.println(b);
		
	}
	public void preIncrement() {
		int a=10;
		System.out.println(a);
		int b=++a;
		System.out.println(b);
		System.out.println(a);
		System.out.println(b);
		
}
}
