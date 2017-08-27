package com.generics;

public class GenMethod {
	/*
	 * this class is normal class which has generic method
	 */
	public static <T> boolean myCompare(T var1, T var2){
		if(var1.equals(var2))
			return true;
		return false;		
	}
}
