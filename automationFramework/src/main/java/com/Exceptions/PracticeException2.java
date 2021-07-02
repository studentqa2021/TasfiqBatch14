package com.Exceptions;

public class PracticeException2 {

	static int a;
	
	public static void main(String[] args)  {
		System.out.println("hi");
		try{System.out.println(2/a);}
		catch(Exception t){
			t.printStackTrace();
		}//runtime and unchecked exception?
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}catch(ArithmeticException a) {
			a.printStackTrace();
		} finally {
			System.exit(0);
		}//compile time excp, checked excep>> InterruptedException
		System.out.println("bye");
	}
}


