package com.rd.Programming;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString rs=new ReverseString();
		rs.logic003();
	}
	//Using a logic.
	public void logic001() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name.....");
		String s=sc.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	// Using String builder
	public void logic002() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name.....");
		String s=sc.next();
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}
	//Using string buffer
	public void logic003() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name.....");
		String s=sc.next();
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}

}
