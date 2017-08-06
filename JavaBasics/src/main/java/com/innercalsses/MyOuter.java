package com.innercalsses;

public class MyOuter {
	private  int x = 10;
	public void displayOuter(){
		System.out.println("outer class text");
	}
	
	public class MyInner{
		public void displayInner(){
			System.out.println("iner class text " + x);
		}
		
	}

}
