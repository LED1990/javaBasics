package com.accessmods;

import com.inheritance.*;
import com.innercalsses.*;
import com.intertype.*;

public class MyMain {

	static int ZMIENNA = 15;
	final static int VAR2 = 15;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZMIENNA += 10;
		int a = 10;
		int b = 20;
		Integer a1 = 10;

		System.out.println("hnged static value: " + ZMIENNA);
		// VAR2 +=10; // final veriables cannot be changed!
		System.out.println("hnged static value: " + VAR2);
		String testString = "heja";
		System.out.println("hnged static value: " + testString);
		testString = "lol";
		System.out.println("hnged static value: " + testString);

		System.out.println("outside before method a: " + a + "and b: " + b);
		changeValues(a, b);
		System.out.println("outside after method a: " + a + "and b: " + b);

		System.out.println("outside before method a1: " + a1);
		changeValues(a1);
		System.out.println("outside after method a1: " + a1);

		Test test = new Test();
		test.displayUsingThis();

		// passing parametrs test
		String t = "lol";
		System.out.println("string value before method call: " + t);
		changeStringValue(t);
		System.out.println("string value after method call: " + t);

		// =============================== BADANIE OBIEKÓW KLAS
		// ===============================================
		System.out.println("==================================== BADANIE OBIEKÓW KLAS=================");
		Test mytest = new Test();
		Test mytest2 = new Test();
		Test mytest3 = new Test();
		System.out.println("mytest.refTest vale before method call: " + mytest.refTest);
		System.out.println("mytest2.refTest vale before method call: " + mytest2.refTest);
		changeTestValue(mytest, mytest2);
		mytest3 = mytest;
		System.out.println("mytest.refTest vale after method call: " + mytest.refTest);
		System.out.println("mytest2.refTest vale after method call: " + mytest2.refTest);

		System.out.println("mytest3.refTest value after asigning to mytest: " + mytest3.refTest);
		addVal(mytest);
		/*
		 * both (mytest and my test3) will change because after assigment
		 * mytest3 = mytest they both point to the same memory locetion
		 */
		System.out.println("mytest.refTest value changed after asigning mytest3: " + mytest.refTest);
		System.out.println("mytest3.refTest value after changing mytest: " + mytest3.refTest);
		addVal(mytest3);
		/*
		 * still both mytest and mytest3 point to the same object in memory
		 * location changing any of them will result changing the same object in
		 * one memory location
		 */
		System.out.println("mytest.refTest value changed after changing my test3: " + mytest.refTest);
		System.out.println("mytest3.refTest value after changing mytest3: " + mytest3.refTest);

		/*
		 * creating new veriable x1 which holds adrress in memory where object
		 * of Class TestReferences is creating reference
		 */
		TestReferences x1 = new TestReferences();
		/*
		 * creating new veriable x3 which holds adrress in memory where object
		 * of Class TestReferences is, but this address is different than in x1
		 * creating reference
		 */
		TestReferences x3 = new TestReferences();
		System.out.println("x1 after creation: " + x1.getA());
		System.out.println("x1 addres: " + x1);
		/*
		 * passing reference (vale of address) by value to method
		 * changeTestreferences() in method argument new veriable is created
		 * which holds the same value as x1
		 */
		changeTestreferences(x1);
		System.out.println("x1 after changing: " + x1.getA());
		/*
		 * assigning x2 to x1. We are passing reference by value to x2. now x2
		 * holds the same addres (reference to memory) as x1
		 */
		TestReferences x2 = x1;
		System.out.println("x2 addres: " + x2);
		/*
		 * assigning x1 to x3. We are passing reference by value to x1. now x1
		 * holds the same addres (reference to memory) as x3
		 */
		x3.setA(33);
		x1 = x3;
		System.out.println("x1 addres: " + x1);
		System.out.println("x3 addres: " + x3);
		System.out.println("x1 after creation: " + x1.getA());
		System.out.println("x1 after creation: " + x2.getA());
		System.out.println("x1 after creation: " + x3.getA());

		String obj1 = new String("xyz");

		String obj2 = new String("xyz");
		Integer k = new Integer(10);
		Integer l = new Integer(10);
		if (k.equals(l))
			// if (k==l)
			System.out.println("obj1==obj2 is TRUE");
		else
			System.out.println("obj1==obj2 is FALSE");
		// =============================== TESTING PRIMITIVES AND OBJECT TYPES
		// =========================
		System.out.println(
				"==================================== BADANIE TYPOW PRYMITYWNYCH I OBIEKTOWYCH =================");
		Integer i = 10;
		System.out.println("Integer object before: " + i);
		int i2 = 10;
		System.out.println("Primitive  before: " + i2);
		changePrimitive(i2);
		changeObject(i);
		System.out.println("Integer object after: " + i);
		System.out.println("Primitive  after: " + i2);
		// =================================== SINGLETON
		// ===============================================
		SingletonTest.getMySingle().displyText();
		SingletonTest mytest1 = SingletonTest.getMySingle();
		mytest1.displyText();
		// ==================================== Interfejsy a klasy
		// ==========================================
		/*
		 * if class implements interface it becomes bot types. Type of class and
		 * type of interface
		 */
		ClassA a11 = new ClassA();
		ClassB b11 = new ClassB();
		InterA a12 = new ClassA();
		InterA b12 = new ClassB();
		displayInters(a11, b11);
		displayInters(a12, b12);
		// =========================================== Binray operations
		// ===================================
		compareBinary(12, 16);
		//==========================================Inner classes ========================
		MyOuter myouter = new MyOuter();
		MyOuter.MyInner oi = myouter.new MyInner();
		oi.displayInner();
		
		MyStaticNested.MyNested mynested = new MyStaticNested.MyNested();
		mynested.displayClassM();
		mynested.displayInstance();		
		//============================================== Anonymus nested Class =======================
		MyAnonymus ma = new MyAnonymus(){
			public void displayAnonymus(){
				System.out.println("I override method from MyAnonymus and I am no name anonymus class "+x);
				anotherMethod();
			}
			public void myMyMehod(){
				System.out.println("can I be used?");
			}
		};
		ma.displayAnonymus();
		ma.displayAnonymus(" hey");
		
		//creating anonymus class by interface
		MyInterace mi = new MyInterace(){
			public void displaySmth() {
				// TODO Auto-generated method stub
				System.out.println("annonymus class with interface type");				
			}
			public void otherMethod(){
				System.out.println("some other method");
			}
		};
		mi.displaySmth();
	
		//========================================= Inheritance ======================
		MySuperclass mySup = new MySubclass();
		mySup.mSuper();
		MySubclass mySub = new MySubclass();
		mySub.sub();
		mySub.mSuper();

		MyInterfaceInheritance myinter = new ExampleClass();
		myinter.interfaceMethod();		
	}

	public static void compareBinary(int z, int y) {
		int counter = 0;
		int x = z ^ y;
		System.out.println("XOR: " + x);
		while (x != 0) {
			counter += x & 1;
			x = x >> 1;
			System.out.println("loop and: " + x);
		}
		System.out.println("counter: " + counter);
	}

	public static void displayInters(InterA x, InterA y) {
		x.interMethod();
		y.interMethod();
	}

	public static void changePrimitive(int o) {
		o += 10;
	}

	public static void changeObject(Integer o) {
		o += 10;
	}

	public static void changeTestreferences(TestReferences tf) {
		tf.setA(99);
	}

	public static void changeValues(int a, int b) {
		a += 10;
		b += 10;
		System.out.println("inside method a: " + a + "and b: " + b);
	}

	public static void changeValues(Integer a1) {
		a1 += 10;
		System.out.println("inside method a1: " + a1);
	}

	public static void changeTestValue(Test mt, Test mt2) {
		mt.refTest = 666;
		mt2 = mt;
	}

	public static void changeStringValue(String t1) {
		t1 = "ok";
	}

	public static void addVal(Test o1) {
		o1.refTest += 100;
	}

}
