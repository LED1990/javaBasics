package com.accessmods;

public class SingletonTest {

	private static SingletonTest mysingle = null;
	private SingletonTest(){
		
	}
	public static SingletonTest getMySingle(){
		if(mysingle == null){
			mysingle = new SingletonTest();
			return mysingle; 
		}else
			return mysingle;
	}
	public void displyText(){
		System.out.println("my singleton");
	}
}
