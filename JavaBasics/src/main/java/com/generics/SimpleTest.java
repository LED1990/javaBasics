package com.generics;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTest {

	final static Logger STlog = LoggerFactory.getLogger(SimpleTest.class);

	/*
	 * this method should throw runtime error I try to cast Object to string
	 * while one is int
	 */
	public static void excpetiopnTest() {
		/*
		 * while I create list in this example I don't specify stored type - NOT
		 * recommended
		 */
		List list = new ArrayList();
		list.add("string");
		list.add(20);

		for (Object obj : list) {
			String str = (String) obj;// causes exception (ClassCastException)
			STlog.info(obj.toString());
		}
	}

	public static void properListCreation(){
		/*
		 * while creating list specify stored type - RECOMMENDED
		 */
		List<String> list = new ArrayList<String>();
		list.add("string2");
		list.add("string3");
		//list.add(12);//will cos compile time exception
		for (Object obj : list) {
			//cast to string is not needed!! just change in loop definition Object to String
			String str = (String) obj;//causes exception (ClassCastException)			
			STlog.info(obj.toString());
		}
	}

}
