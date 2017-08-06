package com.accessmods;

public class Test {
	int a; 
	int refTest;
	public Test(){
		this(10);
	}
	public Test(int a){
		this.a=a;
	}
	
	public void displayText(){
		System.out.println("text: "+a);
	}
	public void displayUsingThis(){
		this.displayText();
	}

}
