package com.sample.StringHandling;

import java.text.SimpleDateFormat;
import java.util.Date;


public class StringManupulation {
	
	String outerclassVariable = "outer";
	
	public  void stringMethods()
	{
		String S1 = new String("Hello");
		String s2 = "Hello";
		String s3 = "Hello";
		
		System.out.println(S1 == s2);
		System.out.println(s2 == s3);
		
		System.out.println(S1.equals(s2));
		
		String datepattern = "dd/MM/YY";
		SimpleDateFormat onjdate = new SimpleDateFormat(datepattern);
		System.out.println(onjdate.format(new Date()));
		
		 // this statement can not be executed as outer class variable can not 
		//access inner class variable
		//System.out.println(innerClassvariable);
		
		
		
		
		
	}
	// inner class with example
	public void accessInnerClass() 
	{
		
		InnerClass objInnerClass = new InnerClass();
		objInnerClass.innerClassMethod();
	}
	
	 public class InnerClass
	 {
		 
		 public String innerClassvariable = "Innerclass";
		 
		 void innerClassMethod()
		 {
			 // inner class can access both outer and inner class variable
			 System.out.println(innerClassvariable);
			 System.out.println(outerclassVariable);
		 }
				 
		 
	 }
}
