package com.core.java.calling.methods;

public class VariousMethods {
	
	void m1() {
		m2();
	System.out.println("this is my m1 method");
	
	}
	
	void m2() {
		m3(100);
	System.out.println("this is my second method m2");
	}
	
	void m3(int a) {
	System.out.println("this is my m3 method with one parameter");
	
	}
	
	public static void main(String[] args) {
		VariousMethods vm= new VariousMethods();
		vm.m1();
		vm.m2();
		vm.m3(100);
		
	}

}
