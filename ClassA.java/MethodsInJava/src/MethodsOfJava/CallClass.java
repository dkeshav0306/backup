package MethodsOfJava;

import test.CallOne;

public class CallClass {
	public static void m1() {
		System.err.println("this is static method");
	}
	public static void main (String[]args) {
		CallOne.m1();
	}
}
