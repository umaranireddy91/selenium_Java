package com.core.java.variables;

public class VariableTypes {
	
	  int cxno=23877; // instance variables or global variables or non- static variables
	  String cxname= "UmaRani";
	  static int amount = 12500; // Static variables---- 
	  //If we write with keyword "STATIC" before datatype we called as static variables
	  
	
	public void deposit() {
		
		System.out.println(cxno);
		System.out.println(cxname);
		System.out.println(VariableTypes.amount); // while calling static variables in instance method 
		// either we can call directly or indirectly with classname
		System.out.println(amount);
		
	}
	
	public static void withdraw() {
		VariableTypes vt= new VariableTypes();
		vt.deposit();
		System.out.println(amount);
		
		
	}
	
	public static void main(String[] args) {
		VariableTypes myvariables = new VariableTypes();
		myvariables.deposit();
		withdraw();
		//myvariables.withdraw(); // or 
	
		
	}

}
