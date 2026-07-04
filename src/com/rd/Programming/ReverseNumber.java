package com.rd.Programming;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		ReverseNumber rn=new ReverseNumber();
		rn.logic003();
	}

	// using logic algorithm
	public void logic001() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value: ");
		int num = sc.nextInt();
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
	}
	
	public void logic002() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value: ");
		int num = sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		sb.reverse();
		System.out.println(sb);
	}
	
	public void logic003() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value: ");
		int num = sc.nextInt();
		
		StringBuilder sb=new StringBuilder(String.valueOf(num));
		sb.reverse();
		System.out.println(sb);
	}

}
