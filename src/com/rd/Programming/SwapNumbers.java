package com.rd.Programming;

public class SwapNumbers {

	public static void main(String[] args) {

		SwapNumbers sn = new SwapNumbers();
		sn.logic003();

	}

	// using third variable
	public void logic001() {
		int a = 10;
		int b = 20;

		System.out.println("Before Swapping -" + a + "..." + b);

		int t = a;
		a = b;
		b = t;

		System.out.println("After Swapping -" + a + "..." + b);
	}
	// using + & - without using 3 rd variable
	public void logic002() {
		int a=10,b=20;
		System.out.println("Before Swapping --" + a + "..." + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping --" + a + "..." + b);
		
	}
	
	// using * & - without using 3 rd variable
	// a and b should not be 0
		public void logic003() {
			int a=10,b=20;
			System.out.println("Before Swapping ---" + a + "..." + b);
			
			a=a*b;
			b=a/b;
			a=a/b;
			
			System.out.println("After Swapping ---" + a + "..." + b);
			
		}

}
