package com.rd.Programming;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value....");
		int num = sc.nextInt();
		int ex_num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (ex_num == rev) {
			System.out.println(ex_num + "-Given number is Palindrome");
		} else {
			System.out.println(ex_num + "-Given number is not a Palindrome");
		}
	}

}
