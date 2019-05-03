package com.core.modifiers;

 class ClassB extends ClassA{
	
	public void m2() {
		System.out.println("this is m2 method in Class B");
	}
	
	public static void main(String[] args) {
		ClassB b= new ClassB();
		b.m2();
	}

}
