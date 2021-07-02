package com.baseLogin;

import org.openqa.selenium.support.PageFactory;

public class ExceptionsPractice {
	static int b =10;
	static int c=15;
	public static void main(String[] args) {
		//PageFactory.initElements(null, args);

	}
	public static void getExceptions() throws InterruptedException {
		System.out.println(b);//10
		
		Thread.sleep(6000); //compile time exceptions or checked time exceptions 
		System.out.println(10/0);// code run will stop here //ArithmeticException
		System.out.println(c);//15
		//runtime exceptions or unchecked 
		
	}
}
///runtime exceptions or unchecked exceptions 