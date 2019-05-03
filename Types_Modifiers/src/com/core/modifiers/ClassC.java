package com.core.modifiers;

 class ClassC extends ClassA{
	
    void m3() {
		System.out.println("this is the m3 method from Class C");
	}
	
	public static void main(String[] args) {
		ClassC C= new ClassC();
		C.m3();
	}

}
