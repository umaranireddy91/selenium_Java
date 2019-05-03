package com.core.java.datatypes;

public class DataTypes {
	 //Primitive datatypes
	
	byte b =127;
	int i = 15874;
	short s =1258;
	long l= 124587;
	float f = 12.51f;
	double d = 1258.25;
	char c= 'm';
	boolean bb= true;
	
	
	String str= "Hello world!!!!";
	
	public static void main(String[] args) {
		DataTypes dt = new DataTypes();
		
		System.out.println(dt.b);
		System.out.println(dt.i);
		System.out.println(dt.s);
		System.out.println(dt.l);
		
		System.out.println(dt.f);
		System.out.println(dt.d);
		
		System.out.println(dt.c);
		System.out.println(dt.bb);
		
		System.out.println(dt.str);
	}

}
