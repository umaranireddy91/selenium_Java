package com.core.java.calling.methods;

public class Calculations {
	int a=3000;
	int b=50;
	int c;
	
	
	void addition () {
		c = a+b;
		System.out.println("the sum of a & b : "+c);
		
	}
	
	void subtraction () {
		c= a-b;
		System.out.println("the subtraction of a& b :" +c);
		
	}
	void multiplication() { 
		c= a*b;
		System.out.println("the multiplications of a &b : " + c);
		
	}
	void division () {
		c = a/b;
		System.out.println("the division of two values of a& b :" +c);
	}
	public static void main(String[] args) {
		Calculations mycounts = new Calculations();
		mycounts.addition();
		mycounts.subtraction();
		mycounts.multiplication();
		mycounts.division();
		mycounts.testing(20, 30);
		mycounts.myMethod("UmaRani", "Chityala");
		
		
	}
	
	public int testing(int x, int y) {
		int d=0;
		d = x+y;
	System.out.println("my testing method is : " +d);
	return d ;
		
	}
	
	public String myMethod(String firstname, String Lastname) {
		String mystring = null;
		mystring=firstname + Lastname;
		
		System.out.println("mymethod is adding first name and lastname : " +mystring);
		return mystring;
	}

}
