package Java_Class1;

import java.util.Scanner;

public class Test_Class implements TestMyClass{
	int a=20;
	int b=30;
	int c;
	
	void add()
	{
		c= a+b;
		System.out.println("addition of two numbers :" +c);
	}
	
	void multiplication()
	{
		c= a*b;
		System.out.println("multiplication of two numbers :" +c);
	}
		
    static int n=0;
	public static void main(String[] args) {
		Test_Class tc= new Test_Class();
		
		t1=new Test_Class();
		t2= new Test_Class();
		
		t1.m1();
		t2.m2();
		t2.m1();
		t1.m2();
		
		
		
		tc.multiplication();
		tc.add();
		tc.validation();
		tc.check();
		
		
		for (System.out.println("uma");n<=10;n++) {
			
			System.out.println("Durga Software");
			
		}
		
	}

	@Override
	public void validation() {
	System.out.println("My validation My choice");
		
	}

	@Override
	public void check() {
		int x=100, y=120;
		 
		 
	if (x>y) {
	    System.out.println("X IS GREATER THAN Y");
		
	}else {
		System.out.println("X IS LESS THAN Y");
		
	}
	
	 }
	
	static Test_Class t1,t2;
	
	void m1() {
		System.out.println("this is my M1 Method");
	}
	
	void m2() {
		System.out.println("this is my m2 method");
	}
	}


