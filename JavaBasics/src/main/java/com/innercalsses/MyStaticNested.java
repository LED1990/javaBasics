package com.innercalsses;

public class MyStaticNested {
	private int x = 10;
	private static int z =10;
	
	private void instanceMethod(){
		System.out.println("I am instance method");
	}
	private static void classMethod(){
		System.out.println("I am class method");
	}
	
	public static class MyNested{
		
		public void displayInstance(){
			
			System.out.println("static nested class has no access to non static outer methods");
		}
		public void displayClassM(){
			classMethod();
			System.out.println("static nested class has access only to static members of outer class");
		}
	}

}
