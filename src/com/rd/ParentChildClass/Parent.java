package com.rd.ParentChildClass;

public class Parent extends Child{

	public static void main(String[] args) {
		Child c= new Child();
		c.childMethod();	
		System.out.println("Execute Parent Class");
	}

}
