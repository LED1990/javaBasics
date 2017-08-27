package com.mymain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.generics.*;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger MMlog = LoggerFactory.getLogger(MyMain.class);
		
		//SimpleTest.excpetiopnTest();
		SimpleTest.properListCreation();
		
		/*
		 * genric class example
		 * when using generic class (with <T>) there is no need to cast created object to required type!
		 */
		GenClass<String> genObject = new GenClass<String>();
		genObject.setT("generic example");
		MMlog.info(genObject.getT());
		GenClass genObject2 = new GenClass(); // auto casting - if I can call lit like this
		genObject2.setT("second example object");
		MMlog.info((String) genObject2.getT());
		genObject2.setT(55); // here autoboxing works - because above genObject was declared as string
		MMlog.info( genObject2.getT().toString());
		/*
		 * generic method example
		 */
		String v1 = "hello";
		String v2 = "hello";
		int v3 = 10;
		int v4 = 10;
		MMlog.info("comparing Strings result: "+GenMethod.myCompare(v1, v2));
		MMlog.info("comparing ints result: "+GenMethod.myCompare(v3, v4));
	}

}
